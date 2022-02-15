package com.example.forjwebapp.module.user.service.impl;

import com.example.forjwebapp.module.user.dto.request.SignUpRequestDto;
import com.example.forjwebapp.module.user.repository.UserRepository;
import com.example.forjwebapp.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public SignUpRequestDto saveUserData(SignUpRequestDto signUpRequestDto) {
        userRepository.save(signUpRequestDto.toEntity());
        return signUpRequestDto;
    }

    @Override
    public SignUpRequestDto getUserData(String username) {return null;}
}
