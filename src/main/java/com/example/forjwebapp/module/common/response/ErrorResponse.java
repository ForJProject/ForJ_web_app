package com.example.forjwebapp.module.common.response;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ErrorResponse {

    private String code;
    private String error;
    private List<String> message;

    public ErrorResponse(String statusCode, String errorContent, String messages) {
        this.code = statusCode;
        this.error = errorContent;
        this.message = new ArrayList<>();
        this.message.add(messages);
    }

    public ErrorResponse(String statusCode, String errorContent, List<String> messages) {
        this.code = statusCode;
        this.error = errorContent;
        this.message = messages;

    }
}