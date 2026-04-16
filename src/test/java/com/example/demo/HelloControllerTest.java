package com.example.demo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {

    @Test
    void testAddition() {
        assertEquals(5, DemoApplication.add(2, 3));
    }
}