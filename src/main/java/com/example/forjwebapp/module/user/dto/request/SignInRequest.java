package com.example.forjwebapp.module.user.dto.request;

import lombok.Getter;

@Getter
public class SignInRequest {
    private String userEmail;
    private String userPassword;

    public SignInRequest(){}
    public SignInRequest(String userEmail, String userPassword){
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }
}
