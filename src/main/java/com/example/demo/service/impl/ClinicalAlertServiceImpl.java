package com.example.demo.service;
import com.example.demo.model.ClinicalAlert;
import com.example.demo.repository.ClinicalAlertRepository;

@Service
public interface ClinicalAlertServiceImpl implements ClinicalAlert{

private final ClinicalAlertRepository repository;

public ClinicalAlertServiceImpl(ClinicalAlertRepository repository){
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