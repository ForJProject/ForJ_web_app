package com.example.forjwebapp.module.user.service;

import com.example.forjwebapp.module.user.dto.SignIn;
import com.example.forjwebapp.module.user.dto.SignUp;
import com.example.forjwebapp.module.user.entity.User;
import com.example.forjwebapp.module.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public String saveUserData(SignUp.Request signUpRequestDto) {
        String encodedPassword = encodePassword(signUpRequestDto.getUserPassword());
        signUpRequestDto.setUserPassword(encodedPassword);
        try{
            userRepository.save(signUpRequestDto.toEntity());
        }catch(Exception e){
            return "User save failed by internal server error";
        }
        return "User Save Success";
    }
    @Override
    @Transactional
    public boolean isExistsUserByEmail(String email) {
        User user;
        try{
             user = userRepository.findByEmail(email);
        }catch(Exception e){
            return false;
        }
        if(user != null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    @Transactional
    public boolean userLogin(SignIn.Request signInRequestDto){
        User user;
        try{
            user = userRepository.findByEmail(signInRequestDto.getUserEmail());
        }catch(Exception e){
            return false;
        }
        if(user != null){
            if(passwordEncoder.matches(signInRequestDto.getUserPassword(), user.getPassword()))
                return true;
            else
                return false;
        } else {
            return false;
        }
    }

    @Override
    public SignUp.Request getUserData(String username) {
        return null;
    }

    private String encodePassword(String plainPassword){
        return passwordEncoder.encode(plainPassword);
    }
}
