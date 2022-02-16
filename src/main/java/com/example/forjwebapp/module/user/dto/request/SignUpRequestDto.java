package com.example.forjwebapp.module.user.dto.request;

import com.example.forjwebapp.module.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
public class SignUpRequestDto {
    private String userEmail;
    private String userNickName;
    private String userPassword;
    private String userGender;
    private int userAge;
    private String userFavoriteTravel;
    private int userPermission = 0;

    @Builder
    public SignUpRequestDto(
            String userEmail,
            String userNickName,
            String userPassword,
            String userGender,
            int userAge,
            String userFavoriteTravel
    ){
        this.userEmail = userEmail;
        this.userNickName = userNickName;
        this.userPassword = userPassword;
        this.userGender = userGender;
        this.userAge = userAge;
        this.userFavoriteTravel = userFavoriteTravel;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

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


