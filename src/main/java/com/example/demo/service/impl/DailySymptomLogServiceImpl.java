package com.example.demo.service;
import com.example.demo.model.DailySymptomLog;
import com.example.demo.repository.DailySymptomLogRepository;

@Service
public interface DailySymptomLogServiceImpl implements DailySymptomLog{

private final DailySymptomLogRepository repository;

public DailySymptomLogServiceImpl(PatientProfileRepository repository){
    this.repository=repository;
}

@Override
public PatientProfile createPatient(PatientProfile patient){
    return repository.save(patient);
}
@Override
public PatientProfile getPatientById(Long id){
    return repository.findById(id);
}
@Override
public PatientProfile getAllPatients(){
    return repository.findAll();
}
@Override
public PatientProfile updatePatientStatus(Long id,boolean active){
    
}

} 