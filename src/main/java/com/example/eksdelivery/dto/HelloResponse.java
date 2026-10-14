package com.example.eksdelivery.dto;

public record HelloResponse(
        String message,
        String version,
        String environment
) {
}
