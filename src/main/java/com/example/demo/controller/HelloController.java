package com.example.demo.controller;

import com.example.demo.DemoApplication;
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
        return DemoApplication.add(2, 3);
    }
}
