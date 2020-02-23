package com.sdag9.repositories;

import com.sdag9.model.LocalUser;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LocalUserRepository extends CrudRepository<LocalUser, Long> {

    Optional<LocalUser> findByEmailIgnoreCase(String email);

}
