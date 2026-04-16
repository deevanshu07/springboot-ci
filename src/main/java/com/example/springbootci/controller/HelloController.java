package com.example.springbootci.controller;

import com.example.springbootci.SpringbootCiApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello CI Pipeline!";
    }

    @GetMapping("/add")
    public int add() {
        return SpringbootCiApplication.add(2, 3);
    }
}
