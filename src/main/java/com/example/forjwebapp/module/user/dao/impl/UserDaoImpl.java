package com.example.forjwebapp.module.user.dao.impl;

import com.example.forjwebapp.module.user.dao.UserDao;
import com.example.forjwebapp.module.user.dto.UserDto;
import com.example.forjwebapp.module.user.entity.UserEntity;
import com.example.forjwebapp.module.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        userRepository.save(userEntity);
        return userEntity;
    }

    @Override
    public UserEntity getUsers(String useremail) {
        UserEntity userEntity = userRepository.findByEmail("vpdls1511@gmail.com");
        return userEntity;
    }
}
