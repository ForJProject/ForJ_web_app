package com.example.forjwebapp.module.user.repository;

import com.example.forjwebapp.module.user.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(String email);
}
