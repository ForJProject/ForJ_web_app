package com.example.forjwebapp.module.user.controller;

import com.example.forjwebapp.module.user.dto.User;
import com.example.forjwebapp.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/api/users")
    public User getUser(){
        User user = new User();
        userService.saveUserData(user);
        return user;
    }
}
