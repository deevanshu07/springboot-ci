package com.example.springbootci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootCiApplication {

    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootCiApplication.class, args);
    }
}
