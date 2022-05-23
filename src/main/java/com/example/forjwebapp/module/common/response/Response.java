package com.example.forjwebapp.module.common.response;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Response {

    private String code;
    private List<String> message;

    public Response(String statusCode, String messages) {
        this.code = statusCode;
        this.message = new ArrayList<>();
        this.message.add(messages);
    }

    public Response(String statusCode, List<String> messages) {
        this.code = statusCode;
        this.message = messages;

    }
}