package com.example.forjwebapp.module.user.dto;

import com.example.forjwebapp.module.user.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.*;

public class SignUp {
    @Getter
    @Setter
    @Builder
    public static class Request{
        private int userUid;
        @NotBlank(message = "사용자 닉네임이 필요합니다.")
        private String userNickName;
        @NotBlank(message = "사용자 이메일이 필요합니다.")
        @Email(message = "올바른 이메일 형식이 아닙니다.")
        private String userEmail;
        @NotBlank(message = "사용자 비밀번호가 필요합니다.")
        private String userPassword;
        //@NotBlank(message = "사용자 선호 여행지가 필요합니다.")
        private String userFavoriteTravel;
        @Min(value = 1, message = "사용자 나이는 1살 이상이어야 합니다.")
        @Max(value = 100, message = "사용자 나이는 100살 이하여야 합니다.")
        private int userAge;
        @NotBlank(message = "사용자 성별이 필요합니다.")
        private String userGender;
        private int userPermission;

        public User toEntity(){
            return User.builder()
                    .userUid(userUid)
                    .email(userEmail)
                    .nickName(userNickName)
                    .password(userPassword)
                    .gender(userGender)
                    .age(userAge)
                    .favoriteTravel(userFavoriteTravel)
                    .permission(userPermission)
                    .build();
        }

    }


}
