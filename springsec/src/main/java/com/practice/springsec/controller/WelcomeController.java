package com.practice.springsec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Spring Security framework.";
    }

    @GetMapping("/bug")
    public String bug(){
        return "Welcome to Spring Security framework bug with git.";
    }
}
