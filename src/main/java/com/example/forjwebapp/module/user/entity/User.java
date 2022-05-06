package com.example.forjwebapp.module.user.entity;

import com.example.forjwebapp.module.common.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "t_user")
public class User extends BaseEntity {
    //null체크, default 등은 column annotation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int USER_UID;
    private String NICKNAME;
    private String EMAIL;
    private String PASSWORD;
    private String FAVORITE_TRAVEL;
    private int AGE;
    private String GENDER;
    private int PERMISSION;

    public void update(User user){
        this.NICKNAME = user.NICKNAME;
        this.PASSWORD = user.PASSWORD;
        this.FAVORITE_TRAVEL = user.FAVORITE_TRAVEL;
        this.AGE = user.AGE;
        this.GENDER = user.GENDER;

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
