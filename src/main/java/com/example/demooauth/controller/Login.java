package com.example.demooauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @GetMapping("/")
    public String login() {
        return "login to be done";
    }

    @GetMapping("/restricted")
    public String restricted() {
        return "success";
    }
}
