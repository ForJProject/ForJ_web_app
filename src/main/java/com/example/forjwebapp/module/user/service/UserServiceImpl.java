package com.example.forjwebapp.module.user.service;

import com.example.forjwebapp.module.user.dto.SignUp;
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
        String plainPassword = signUpRequestDto.getUserPassword();
        String encodePassword = passwordEncoder.encode(plainPassword);
        signUpRequestDto.setUserPassword(encodePassword);
        userRepository.save(signUpRequestDto.toEntity());
        return "success";
    }

    @Override
    public SignUp.Request getUserData(String username) {
        return null;
    }
}
