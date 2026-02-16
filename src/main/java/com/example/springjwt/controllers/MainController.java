package com.example.springjwt.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MainController {
    @GetMapping("/welcome")
    public String allAccess() {
        return "Hello everyone";
    }

    @GetMapping("/user")
    public String userAccess() {
        return "User content with JWT";
    }

    @GetMapping("/special")
    public String specialAccess() {
        return "Special Access with JWT";
    }
}
