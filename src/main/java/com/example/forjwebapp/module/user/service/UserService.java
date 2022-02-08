package com.example.forjwebapp.module.user.service;

import com.example.forjwebapp.module.user.dto.UserDto;

import java.util.List;

public interface UserService {
    public List<UserDto> saveUserData(UserDto user);
    public UserDto getUserData(String username);
}
