package com.example.forjwebapp.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SignUpTest {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    @DisplayName("패스워드 암호화 테스트")
    void encryptPasswordTest(){

        String plainPassword = "Tekjtqpokdmf!@31daf";
        String encodePassword = passwordEncoder.encode(plainPassword);

        System.out.println("=================== EncryptPassword ====================");
        System.out.println(encodePassword);
        System.out.println("=================== EncryptPassword ====================");

        assertAll(
                () -> assertNotEquals(plainPassword, encodePassword),
                () -> assertTrue(passwordEncoder.matches(plainPassword, encodePassword))
        );
    }
}
