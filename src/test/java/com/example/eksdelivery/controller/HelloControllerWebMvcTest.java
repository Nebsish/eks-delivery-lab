package com.example.eksdelivery.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
public class HelloControllerWebMvcTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void shouldReturnHelloResponse() throws Exception {
        mockMvc
                .perform(get("/api/hello"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Hello from EKS Delivery Lab"))
                .andExpect(jsonPath("$.version").value("v1"))
                .andExpect(jsonPath("$.environment").value("local"));

    }
}
