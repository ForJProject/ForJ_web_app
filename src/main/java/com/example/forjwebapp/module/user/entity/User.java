package com.example.forjwebapp.module.user.entity;

import com.example.forjwebapp.module.common.entity.BaseEntity;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@DynamicInsert
@Table(name = "t_user")
public class User extends BaseEntity {
    //todo : null체크, default 등은 column annotation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_uid")
    private int userUid;
    @Column(length = 100)
    private String nickName;
    @Column
    private String email;
    @Column
    private String password;
    @Column(name = "favorite_travel")
    private String favoriteTravel;
    @Column
    private Integer age;
    @Column
    private String gender;
    @ColumnDefault("1")
    private Integer permission;


}
