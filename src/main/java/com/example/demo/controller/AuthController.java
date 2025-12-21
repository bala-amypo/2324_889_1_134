package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.PatientProfileService;
import com.example.demo.model.PatientProfile;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientProfileController {

    @Autowired
    private PatientProfileService service;

    @PostMapping
    public PatientProfile createPatient(@Valid @RequestBody PatientProfile patient) {
        return service.createPatient(patient);
    }

    @GetMapping("/{id}")
    public PatientProfile getPatient(@PathVariable Long id) {
        return service.getPatientById(id);
    }

    @GetMapping
    public List<PatientProfile> getAllPatients() {
        return service.getAllPatients();
    }

    @PutMapping("/{id}/status")
    public String updateStatus(@PathVariable Long id) {
        service.updatePatientStatus(id, true);
        return "Status Updated";
    }

    @GetMapping("/lookup/{patientid}")
    public PatientProfile lookupByPatientId(@PathVariable String patientid) {
        return service.getByPatientId(patientid);
    }
}




package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.AppUser;
import com.example.demo.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService service;

    
    @PostMapping("/register")
    public String registerUser(@RequestBody AppUser user) {
        service.register(user);
        return "User Registered Successfully";
    }
@PostMapping("/login")
    public AppUser loginUser(@RequestBody AppUser user) {
        return service.login(user);
    }
}


