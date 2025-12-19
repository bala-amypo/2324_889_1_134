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
public ClinicalAlert createAlert(ClinicalAlert alert){
    return repository.save(alert);
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