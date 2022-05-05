package com.example.forjwebapp.module.user.service;

import com.example.forjwebapp.module.user.dto.SignUp;

import java.util.List;

public interface UserService {
    public String saveUserData(SignUp.Request signUpRequestDto);
    public SignUp.Request getUserData(String username);
}
