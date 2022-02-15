package com.example.forjwebapp.module.user.service.impl;

import com.example.forjwebapp.module.user.dto.request.SignUpRequest;
import com.example.forjwebapp.module.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<SignUpRequest> saveUserData(SignUpRequest signUpRequest) {
        return null;
    }

    @Override
    public SignUpRequest getUserData(String username) {
        return null;
    }
}
