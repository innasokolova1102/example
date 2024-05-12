package com.inna.core.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetController {


   @Value("${message.in_progress}")
    private String message;


    @GetMapping
    public String getGreeting() {
        return "Hello from "+ message;
    }
}
