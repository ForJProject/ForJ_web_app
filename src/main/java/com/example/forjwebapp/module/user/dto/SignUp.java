package com.example.forjwebapp.module.user.dto;

import com.example.forjwebapp.module.user.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class SignUp {
    @Getter
    @Setter
    @Builder
    public static class Request{
        private int userUid;
        private String userNickName;
        private String userEmail;
        private String userPassword;
        private String userFavoriteTravel;
        private int userAge;
        private String userGender;
        private int userPermission;

        public User toEntity(){
            return User.builder()
                    .USER_UID(userUid)
                    .EMAIL(userEmail)
                    .NICKNAME(userNickName)
                    .PASSWORD(userPassword)
                    .GENDER(userGender)
                    .AGE(userAge)
                    .FAVORITE_TRAVEL(userFavoriteTravel)
                    .PERMISSION(userPermission)
                    .build();
        }

    }


}
