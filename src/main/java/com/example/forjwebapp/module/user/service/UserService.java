package com.example.forjwebapp.module.user.service;

import com.example.forjwebapp.module.user.dto.request.SignUpRequestDto;

import java.util.List;

public interface UserService {
    public SignUpRequestDto saveUserData(SignUpRequestDto signUpRequestDto);
    public SignUpRequestDto getUserData(String username);
}
