package com.example.forjwebapp.module.user.dao;

import com.example.forjwebapp.module.user.dto.UserDto;
import com.example.forjwebapp.module.user.entity.UserEntity;

import java.util.List;

public interface UserDao {
    UserEntity saveUser(UserEntity userEntity);
    UserEntity getUsers(String useremail);
}
