package com.example.forjwebapp.module.user.service;

import com.example.forjwebapp.module.user.dto.request.SignUpRequest;

import java.util.List;

public interface UserService {
    public List<SignUpRequest> saveUserData(SignUpRequest signUpRequest);
    public SignUpRequest getUserData(String username);
}
