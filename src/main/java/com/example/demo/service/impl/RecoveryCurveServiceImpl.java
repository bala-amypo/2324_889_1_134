package com.example.demo.service;
import com.example.demo.model.RecoveryCurveProfile;
import com.example.demo.repository.RecoveryCurveRepository;

@Service
public interface RecoveryCurveServiceImpl  implements RecoveryCurveProfilr{

private final RecoveryCurveRepository repository;

public RecoveryCurveServiceImpl(RecoveryCurveRepository repository){
    this.repository=repository;
}

@Override
public  RecoveryCurveProfile createCurveEntry(RecoveryCurveProfile entry){
    return repository.save(entry);
}
@Override
public  RecoveryCurveProfile getCurveForSurgery(String surgeryType){
    return repository.findBySurgeryType(surgeryType);
}
