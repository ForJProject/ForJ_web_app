package com.example.forjwebapp.module.user.dao;

import com.example.forjwebapp.module.user.entity.User;

public interface UserDao {
    User saveUser(User userEntity);
    User getUsers(String userEmail);
}
