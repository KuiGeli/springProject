package com.sdag9.service;

import com.sdag9.dto.UserRegistrationDTO;
import com.sdag9.model.LocalUser;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


public interface UserService extends UserDetailsService {

    LocalUser findByEmail(String eMail);
    LocalUser save(UserRegistrationDTO userDTO);

}
