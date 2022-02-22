package com.example.forjwebapp.module.user.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
        private String userEmail;
        private String userPassword;
    }

    @Getter
    @NoArgsConstructor
    public static class Response{
        private Info info;
        private String userEmail;
    }
}
