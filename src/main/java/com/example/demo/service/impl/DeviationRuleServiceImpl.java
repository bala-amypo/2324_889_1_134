package com.example.demo.service;
import com.example.demo.model.DeviationRule;
import com.example.demo.repository.DeviationRuleRepository;

@Service
public interface DeviationRuleServiceImpl implements DeviationRule{

private final DeviationRuleRepository repository;

public DeviationRuleServiceImpl(PatientProfileRepository repository){
    this.repository=repository;
}

@Override
public DeviationRule createRule(DeviationRule rule){
    return repository.save(rule);
}
@Override
public DeviationRule getRulesBySurgery(string surgeryType ){
    return repository.findById(surgeryType);
}
@Override
public List<DeviationRule> getAllRules(){
    return repository.findAll();
}

} 