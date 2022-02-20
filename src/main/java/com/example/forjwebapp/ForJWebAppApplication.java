package com.example.forjwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ForJWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForJWebAppApplication.class, args);
    }
}
