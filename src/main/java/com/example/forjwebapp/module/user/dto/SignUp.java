package com.example.forjwebapp.module.user.dto;

import com.example.forjwebapp.module.user.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

public class SignUp {
    @Getter
    @Setter
    @Builder
    public static class Request{
        private int userUid;
        @NotBlank
        private String userNickName;
        @Email
        @NotBlank
        private String userEmail;
        @NotBlank
        private String userPassword;
        @NotBlank
        private String userFavoriteTravel;
        @Min(value = 1, message = "Age should not be less than 1")
        @Max(value = 100, message = "Age should not be greater than 100")
        private int userAge;
        @NotBlank
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
