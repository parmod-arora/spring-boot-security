package com.parmodarora.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmodarora.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByEmail(String email);
}
