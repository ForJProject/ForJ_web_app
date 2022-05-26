package com.example.forjwebapp.module.user.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class SignIn {

    @Getter
    @Setter
    @Builder
    public static class Info{
        private int userUid;
        private String userNickName;
        private String userFavoriteTravel;
        private int userAge;
        private String userGender;
        private int userPermission;
    }

    @Getter
    @Setter
    public static class Request{
        @NotBlank(message = "사용자 이메일이 필요합니다.")
        @Email(message = "올바른 이메일 형식이 아닙니다.")
        private String userEmail;
        @NotBlank(message = "사용자 비밀번호가 필요합니다.")
        private String userPassword;
    }

    @Getter
    @NoArgsConstructor
    public static class Response{
        private Info info;
        private String userEmail;
    }
}
