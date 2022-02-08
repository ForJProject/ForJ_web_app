package com.example.forjwebapp.module.user.repository;

import com.example.forjwebapp.module.user.dto.UserDto;
import com.example.forjwebapp.module.user.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.TypedQuery;

public interface UserRepository extends JpaRepository<UserEntity, String> {

    default UserEntity findByEmail(String name){
        //TypedQuery<UserEntity> typedQuery = c
        return null;
    };
}
