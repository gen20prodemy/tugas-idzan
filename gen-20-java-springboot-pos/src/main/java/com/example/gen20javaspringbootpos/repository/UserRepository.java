package com.example.gen20javaspringbootpos.repository;

import com.example.gen20javaspringbootpos.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
