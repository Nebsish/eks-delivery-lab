package com.example.eksdelivery.controller;

import com.example.eksdelivery.dto.HelloResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {


    private final  HelloController controller = new HelloController();

    @Test
    void helloShouldReturnCorrectMessage() {
        HelloResponse response = controller.hello();

        assertNotNull(response);
        assertEquals("Hello from EKS Delivery Lab", response.message());
        assertEquals("v1", response.version());
        assertEquals("local", response.environment());
    }
}