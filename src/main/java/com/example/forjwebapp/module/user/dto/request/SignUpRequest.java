package com.example.forjwebapp.module.user.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class SignUpRequest {
    private int userUid;
    private String userNickName;
    private String userEmail;
    private String userPassword;
    private String userFavoriteTravel;
    private int userAge;
    private String userGender;
    private int userPermission;

    public SignUpRequest(){}
    public SignUpRequest(
            int userUid,
            String userNickName,
            String userEmail,
            String userPassword,
            String userFavoriteTravel,
            int userAge,
            String userGender,
            int userPermission){
        this.userUid = userUid;
        this.userNickName = userNickName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userFavoriteTravel = userFavoriteTravel;
        this.userAge = userAge;
        this.userGender = userGender;
        this.userPermission = userPermission;
    }
}
