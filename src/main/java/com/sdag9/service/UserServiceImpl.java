package com.sdag9.service;

import com.sdag9.dto.UserRegistrationDTO;
import com.sdag9.model.LocalUser;
import com.sdag9.repositories.LocalUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final LocalUserRepository localUserRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(LocalUserRepository localUserRepository, BCryptPasswordEncoder passwordEncoder) {
        this.localUserRepository = localUserRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostConstruct
    public void init() {
        Optional<LocalUser> localUserOptional = localUserRepository.findByEmailIgnoreCase("admin.admin");
        if(localUserOptional.isPresent()){
            return;
        }
        LocalUser localUser = new LocalUser();
        localUser.seteEmail("admin.admin");
        localUser.setPassword(passwordEncoder.encode("adminPassword"));
        localUserRepository.save(localUser);
    }

    @Override
    public LocalUser findByEmail(String email) {
        return localUserRepository.findByEmailIgnoreCase(email)
                .orElseThrow(() -> new UsernameNotFoundException("User cannot be found"));
    }

    @Override
    public LocalUser save(UserRegistrationDTO userDTO) {
        LocalUser localUser = new LocalUser();
        localUser.seteEmail(userDTO.geteMail());
        localUser.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        localUserRepository.save(localUser);
        return localUser;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        LocalUser localUser = findByEmail(s);

        return new User(localUser.geteEmail(), localUser.getPassword(), Collections.singleton(new SimpleGrantedAuthority("ROLE_USER")));
    }
}
