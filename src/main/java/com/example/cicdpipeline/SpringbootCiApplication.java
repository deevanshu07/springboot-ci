package com.example.cicdpipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootCiApplication {

    public static int add(int a, int c) {
        return a + c;
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootCiApplication.class, args);
    }
}
