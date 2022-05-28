package com.example.forjwebapp.module.user.controller;

import com.example.forjwebapp.module.common.response.ErrorResponse;
import com.example.forjwebapp.module.common.response.Response;
import com.example.forjwebapp.module.user.dto.SignIn;
import com.example.forjwebapp.module.user.dto.SignUp;
import com.example.forjwebapp.module.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    @PostMapping("/api/users")
    public ResponseEntity createUser(@Valid @RequestBody SignUp.Request signUpRequestDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            List<String> errorList = bindingResult.getAllErrors().stream().map(e -> e.getDefaultMessage()).collect(Collectors.toList());
            logger.warn("Invalid request body :: api/users");
            return ResponseEntity.badRequest().body(new ErrorResponse("400", "Validation failed", errorList));
        }
        if (userService.isExistsUserByEmail(signUpRequestDto.getUserEmail())) {
            return ResponseEntity.badRequest().body(new ErrorResponse("400", "User save failed", "Already exists User"));
        }
        //todo : response status code static하게 정의하도록 결정 (ex : BAD_REQUEST = 400)
        return ResponseEntity.ok().body(new Response("200", userService.saveUserData(signUpRequestDto)));
    }

    @PostMapping("/api/login")
    public ResponseEntity login(@Valid @RequestBody SignIn.Request signInRequestDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            List<String> errorList = bindingResult.getAllErrors().stream().map(e -> e.getDefaultMessage()).collect(Collectors.toList());
            logger.warn("Invalid request body :: api/login");
            return ResponseEntity.badRequest().body(new ErrorResponse("400", "Validation failed", errorList));
        }
        if (!userService.userLogin(signInRequestDto)) {
            return ResponseEntity.badRequest().body(new ErrorResponse("400", "login failed", "Invalid user info"));
        }
        //todo : response status code static하게 정의하도록 결정 (ex : BAD_REQUEST = 400)
        return ResponseEntity.ok().body(new Response("200", "login Success"));
    }
}
