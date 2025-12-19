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
public DailySymptomLog createRule(recordLog log){
    return repository.save(log);
}
@Override
public DailySymptomLog getLogsByPatient(Long patientid){
    return repository.findById(patientid);
}
@Override
public DailySymptomLog getLogById(Long id){
    return repository.findById(Long id);
}

} 