package com.example.demo.service.impl;

import com.example.demo.model.RecoveryCurveProfile;
import com.example.demo.repository.RecoveryCurveRepository;
import com.example.demo.service.RecoveryCurveService;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RecoveryCurveServiceImpl implements RecoveryCurveService {

    private final RecoveryCurveRepository repository;

    public RecoveryCurveServiceImpl(RecoveryCurveRepository repository) {
        this.repository = repository;
    }

    @Override
    public RecoveryCurveProfile createCurveEntry(RecoveryCurveProfile entry) {
        return repository.save(entry);
    }

    @Override
    public RecoveryCurveProfile getCurveForSurgery(String surgeryType) {
        return repository.findBySurgeryType(surgeryType);
    }

    @Override
    public List<RecoveryCurveProfile> getAllCurve() {
        return repository.findAll();
    }
}
