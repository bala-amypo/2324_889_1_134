package com.example.demo.service;
import com.example.demo.model.PaitentProfile;
import com.example.demo.repository.PatientProfileRepository;

@Service
public interface PatientProfileServiceImpl implements PaitentProfile{

private final PatientProfileRepository repository;

public PatientProfileServiceImpl(PatientProfileRepository repository){
    this.repository=repository;
}

@Override
public PatientProfile createPatient(PatientProfile patient){
     return repository.save(patient);
}
@Override
public PatientProfile getPatientById(Long id){
     return repository.findById();
}



} 