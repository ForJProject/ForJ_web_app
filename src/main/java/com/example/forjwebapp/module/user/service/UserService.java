package com.example.forjwebapp.module.user.service;

import com.example.forjwebapp.module.user.dto.User;

import java.util.List;

public interface UserService {
    public List<User> saveUserData(User user);
}
