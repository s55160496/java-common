package com.example.common;

import lombok.Data;

import java.security.PrivateKey;

@Data
public class EmailRequest {

    private  String to;

    private String subject;

    private  String content;

}
