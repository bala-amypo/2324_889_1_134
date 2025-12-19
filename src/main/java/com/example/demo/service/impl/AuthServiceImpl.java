package com.example.demo.service;
import com.example.demo.model.AppUser;
import com.example.demo.repository.Repository;

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
public List<ClinicalAlert> getAlertByPatient(Long patientid){
    return repository.findById(patientid);
}
@Override
public ClinicalAlert getLogById(Long id){
    return repository.findById(Long id);
}

} 