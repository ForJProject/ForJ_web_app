package com.example.forjwebapp.module.user.dao;

import com.example.forjwebapp.module.user.dao.UserDao;
import com.example.forjwebapp.module.user.entity.User;
import com.example.forjwebapp.module.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl implements UserDao {

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public User getUsers(String userEmail) {
        User user = userRepository.findByEmail("vpdls1511@gmail.com");
        return user;
    }
}
