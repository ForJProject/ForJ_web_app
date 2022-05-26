package com.example.forjwebapp.module.user.service;

import com.example.forjwebapp.module.user.dto.SignIn;
import com.example.forjwebapp.module.user.dto.SignUp;

public interface UserService {
    public String saveUserData(SignUp.Request signUpRequestDto);
    public boolean isExistsUserByEmail(String email);
    public boolean userLogin(SignIn.Request signInRequestDto);
    public SignUp.Request getUserData(String username);
}
