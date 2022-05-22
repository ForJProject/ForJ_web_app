package com.example.forjwebapp.module.user.controller;

import com.example.forjwebapp.module.common.entity.error.ErrorResponse;
import com.example.forjwebapp.module.user.dto.SignUp;
import com.example.forjwebapp.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/api/users")
    public ResponseEntity createUser(@Valid @RequestBody SignUp.Request signUpRequestDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            return ResponseEntity.ok(new ErrorResponse("404", "Invalid request", "Invalid request"));
        }
        return ResponseEntity.ok().body(userService.saveUserData(signUpRequestDto));
    }
}
