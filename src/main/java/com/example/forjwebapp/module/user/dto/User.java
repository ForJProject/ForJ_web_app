package com.example.forjwebapp.module.user.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User {
    private String uuid;
    private String nickname;
    private String email;
    private String password;
    private List<String> favoriteTravel;
    private int age;
    private String gender;
    private int permission;

}
