package com.example.demo.dto;

public class AuthResponse {
    private String email;
    private String token;
    private String role;

    public AuthResponse(String email, String token, String role) {
        this.email = email;
        this.token = token;
        this.role = role;
    }

    public String getEmail() { return email; }
    public String getToken() { return token; }
    public String getRole() { return role; }
}