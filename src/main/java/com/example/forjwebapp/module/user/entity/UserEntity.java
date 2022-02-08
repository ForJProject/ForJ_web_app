package com.example.forjwebapp.module.user.entity;

import com.example.forjwebapp.module.user.dto.UserDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_uid;

    private String nickname;
    private String email;
    private String user_password;
    private String favoriteTravel;
    private int age;
    private String gender;
    private int userPermission;

    public UserDto toDto(){
        return UserDto.builder()
                .user_uid(user_uid)
                .nickname(nickname)
                .email(email)
                .user_password(user_password)
                .favoriteTravel(favoriteTravel)
                .age(age)
                .gender(gender)
                .userPermission(userPermission)
                .build();
    }

}
