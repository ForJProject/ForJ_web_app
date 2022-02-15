package com.example.forjwebapp.module.user.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
public class User extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userUid;
    private String userNickName;
    private String userEmail;
    private String userPassword;
    private String userFavoriteTravel;
    private int userAge;
    private String userGender;
    private int userPermission;


    public void update(User user){
        this.userNickName = user.userNickName;
        this.userPassword = user.userPassword;
        this.userFavoriteTravel = user.userFavoriteTravel;
        this.userAge = user.userAge;
        this.userGender = user.userGender;

    }
    /*public UserDto toDto(){
        return UserDto.builder()
                .user_uid(user_uid)
                .nickname(nickname)
                .email(email)
                .user_password(user_password)
                .favoriteTravel(favoriteTravel)
                .age(age)
                .gender(gender)
                .userPermission(userPermission)
                .build();
    }*/

}
