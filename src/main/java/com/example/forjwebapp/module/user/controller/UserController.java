package com.example.forjwebapp.module.user.controller;

import com.example.forjwebapp.module.user.dto.request.SignUpRequestDto;
import com.example.forjwebapp.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/api/users")
    public SignUpRequestDto saveUser(@RequestBody SignUpRequestDto signUpRequestDto){
        return userService.saveUserData(signUpRequestDto);
    }
}
