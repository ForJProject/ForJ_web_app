package com.example.forjwebapp.module.user.service.impl;

import com.example.forjwebapp.module.user.dao.UserDao;
import com.example.forjwebapp.module.user.dto.UserDto;
import com.example.forjwebapp.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<UserDto> saveUserData(UserDto user) {
        return null;
    }

    @Override
    public UserDto getUserData(String username) {
        return null;
    }
}
