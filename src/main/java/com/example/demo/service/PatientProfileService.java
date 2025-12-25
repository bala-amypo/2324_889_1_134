package com.example.demo.service;

import com.example.demo.model.PatientProfile;
import java.util.List;

@Service
public class PatientProfileServiceImpl implements PatientProfileService {

    private final PatientProfileRepository repo;

    public PatientProfileServiceImpl(PatientProfileRepository repo) {
        this.repo = repo;
    }

    public PatientProfile createPatient(PatientProfile p) {
        return repo.save(p);
    }

    public PatientProfile getPatientById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found"));
    }

    public PatientProfile updatePatientStatus(Long id, boolean active) {
        PatientProfile p = getPatientById(id);
        p.setActive(active);
        return repo.save(p);
    }

    public Optional<PatientProfile> findByPatientId(String pid) {
        return repo.findByPatientId(pid);
    }

    public List<PatientProfile> getAllPatients() {
        return repo.findAll();
    }
}
