package com.example.forjwebapp.module.user.service;

import com.example.forjwebapp.module.user.dto.SignUp;

public interface UserService {
    public String saveUserData(SignUp.Request signUpRequestDto);
    public boolean isExistsUserByEmail(String email);
    public SignUp.Request getUserData(String username);
}
