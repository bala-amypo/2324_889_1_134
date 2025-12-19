package com.example.demo.service;
import com.example.demo.model.RecoveryCurve;
import com.example.demo.repository.RecoveryCurveRepository;

@Service
public interface  implements PaitentProfile{

private final PatientProfileRepository repository;

public PatientProfileImpl(PatientProfileRepository repository){
    this.repository=repository;
}

@Override
public PatientProfile createPatient(PatientProfile patient){
    
}