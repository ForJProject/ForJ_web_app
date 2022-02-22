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
                    .userEmail(userEmail)
                    .userNickName(userNickName)
                    .userPassword(userPassword)
                    .userGender(userGender)
                    .userAge(userAge)
                    .userFavoriteTravel(userFavoriteTravel)
                    .userPermission(userPermission)
                    .build();
        }

    }


}
