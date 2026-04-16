package com.example.demo;


import com.example.demo.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// Load only controller
@WebMvcTest(HelloController.class)

// Include main class for static method access
@ContextConfiguration(classes = {HelloController.class, DemoApplication.class})
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testHelloEndpoint() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello CI Pipeline!"));
    }

    @Test
    void testAddEndpoint() throws Exception {
        mockMvc.perform(get("/add"))
                .andExpect(status().isOk())
                .andExpect(content().string("5"));
    }

    @Test
    void testAddPositiveNumbers() {
        assertEquals(5, DemoApplication.add(2, 3));
    }

    @Test
    void testAddWithZero() {
        assertEquals(3, DemoApplication.add(3, 0));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-5, DemoApplication.add(-2, -3));
    }

    @Test
    void testAddMixedNumbers() {
        assertEquals(1, DemoApplication.add(-2, 3));
    }
}