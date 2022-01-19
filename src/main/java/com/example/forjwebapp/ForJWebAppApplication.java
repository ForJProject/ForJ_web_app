package com.example.forjwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;

@RestController
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ForJWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForJWebAppApplication.class, args);
    }
    @RequestMapping(path="/")
    public String helloWorld(){
        return "Helloworld";
    }
}
