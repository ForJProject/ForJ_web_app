package com.example.forjwebapp.module.user.service;

import com.example.forjwebapp.module.user.dao.UserDao;
import com.example.forjwebapp.module.user.dto.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> saveUserData(User user) {

        return null;

    }
}
