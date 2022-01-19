package com.example.forjwebapp.module.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {

    @RequestMapping(path="/hello",method = RequestMethod.GET)
    public String helloWorld(){
        return "Helloworld";
    }
}
