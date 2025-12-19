package com.example.demo.service;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.model.AppUser;
import com.example.demo.repository.AppUserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final AppUserRepository repository;

    public AuthServiceImpl(AppUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public AuthResponse register(RegisterRequest request) {

        if (repository.findByEmail(request.getEmail()).isPresent()) {
            throw new RuntimeException("Email already registered");
        }

        AppUser user = new AppUser();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword()); 
        user.setRole("USER");

        repository.save(user);

        return new AuthResponse("User registered successfully");
    }
    @Override
    public AuthResponse login(AuthRequest request) {

        AppUser user = repository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!user.getPassword().equals(request.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        return new AuthResponse("Login successful");
    }
}
