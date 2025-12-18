package com.example.demo.model;
import jakarta.persistence.Id;

public class AppUser{
    @Id
    private Long id;
    @Column(n)
    private String email;
    private String password;
    private String role;
}