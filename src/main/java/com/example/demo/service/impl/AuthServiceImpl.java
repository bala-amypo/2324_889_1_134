package com.example.demo.service;
import com.example.demo.model.AppUser;
import com.example.demo.repository.AppUserRepository;

@Service
public interface ClinicalAlertServiceImpl implements ClinicalAlert{

private final ClinicalAlertRepository repository;

public AuthServiceImpl(AppUserRepository repository){
    this.repository=repository;
}

@Override
public AppUser register(RegisterRequest request){
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