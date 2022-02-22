package com.example.forjwebapp.module.user.service;

import com.example.forjwebapp.module.user.dto.SignUp;
import com.example.forjwebapp.module.user.dto.request.SignUpRequestDto;

import java.util.List;

public interface UserService {
    public String saveUserData(SignUp.Request signUpRequestDto);
    public SignUpRequestDto getUserData(String username);
}
