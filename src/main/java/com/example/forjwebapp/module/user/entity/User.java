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
    private int USER_UID;
    @Column(length = 100)
    private String NICKNAME;
    private String EMAIL;
    private String PASSWORD;
    private String FAVORITE_TRAVEL;
    private Integer AGE;
    private String GENDER;
    @ColumnDefault("1")
    private Integer PERMISSION;


}
