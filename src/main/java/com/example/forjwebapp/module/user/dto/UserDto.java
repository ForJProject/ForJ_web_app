package com.example.forjwebapp.module.user.dto;

import com.example.forjwebapp.module.user.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private int user_uid;
    private String nickname;
    private String email;
    private String user_password;
    private String favoriteTravel;
    private int age;
    private String gender;
    private int userPermission;

    public UserEntity toEntity(){
        return UserEntity.builder()
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
