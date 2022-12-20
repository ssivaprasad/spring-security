package com.ssp.apps.spring.security;

import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface UserRepository extends Repository<User, String> {

    Optional<User> findById(String userName);
    Optional<User> findByUserName(String userName);
}
