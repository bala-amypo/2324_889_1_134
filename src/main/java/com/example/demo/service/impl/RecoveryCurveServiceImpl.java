package com.example.demo.service;
import com.example.demo.model.PaitentProfile;
import com.example.demo.repository.PatientProfileRepository;

@Service
public interface PatientProfileImpl implements PaitentProfile{

private final PatientProfileRepository repository;

public PatientProfileImpl(PatientProfileRepository repository){
    this.repository=repository;
}

@Override
public PatientProfile createPatient(PatientProfile patient){
    
}