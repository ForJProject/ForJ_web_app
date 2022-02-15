package com.example.forjwebapp.module.user.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SignUpRequest {
    private int userUid;
    private String userNickName;
    private String userEmail;
    private String userPassword;
    private String userFavoriteTravel;
    private int userAge;
    private String userGender;
    private int userPermission;
}
