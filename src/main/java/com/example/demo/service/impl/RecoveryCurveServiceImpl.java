package com.example.demo.service;
import com.example.demo.model.RecoveryCurve;
import com.example.demo.repository.RecoveryCurveRepository;

@Service
public interface RecoveryCurveServiceImpl  implements RecoveryCurve{

private final RecoveryCurveRepository repository;

public RecoveryCurveServiceImpl(RecoveryCurveRepository repository){
    this.repository=repository;
}

@Override
public  RecoveryCurve createCurveEntry(RecoveryCurveProfile ){
    
}