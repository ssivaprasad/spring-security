package com.ssp.apps.spring.security.repository;

import com.ssp.apps.spring.security.entity.User;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface UserRepository extends Repository<User, String> {

    Optional<User> findById(String userName);
    Optional<User> findByUserName(String userName);
}
