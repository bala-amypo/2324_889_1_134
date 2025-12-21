package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.RecoveryCurveProfile;
import com.example.demo.repository.RecoveryCurveProfileRepository;
import com.example.demo.service.RecoveryCurveService;
import com.example.demo.exception.ResourceNotFoundException;
import java.util.List;

@Service
public class RecoveryCurveServiceImpl implements RecoveryCurveService {

    @Autowired
    private RecoveryCurveProfileRepository repo;

    @Override
    public RecoveryCurveProfile createCurveEntry(RecoveryCurveProfile curve) {
        return repo.save(curve);
    }

    @Override
    public List<RecoveryCurveProfile> getCurveForSurgery(String surgeryType) {
        return repo.findBySurgeryType(surgeryType);
    }

    @Override
    public RecoveryCurveProfile getCurveById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Curve not found"));
    }

    @Override
    public List<RecoveryCurveProfile> getAllCurves() {
        return repo.findAll();
    }
}
[12:18 pm, 21/12/2025] பிரியா 🦋: package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.PatientProfile;
import com.example.demo.repository.PatientProfileRepository;
import com.example.demo.service.PatientProfileService;
import com.example.demo.exception.ResourceNotFoundException;
import java.util.List;

@Service
public class PatientProfileServiceImpl implements PatientProfileService {

    @Autowired
    private PatientProfileRepository repo;

    @Override
    public PatientProfile createPatient(PatientProfile patient) {
        return repo.save(patient);
    }

    @Override
    public PatientProfile getPatientById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found"));
    }

    @Override
    public List<PatientProfile> getAllPatients() {
        return repo.findAll();
    }

    @Override
    public void updatePatientStatus(Long id, boolean active) {
        PatientProfile patient = getPatientById(id);
        patient.setActive(active);
        repo.save(patient);
    }

    @Override
    public PatientProfile getByPatientId(String patientid) {
        return repo.findByPatientid(patientid);
    }
}
[12:18 pm, 21/12/2025] பிரியா 🦋: package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DeviationRule;
import com.example.demo.repository.DeviationRuleRepository;
import com.example.demo.service.DeviationRuleService;
import com.example.demo.exception.ResourceNotFoundException;

import java.util.List;

@Service
public class DeviationRuleServiceImpl implements DeviationRuleService {

    @Autowired
    private DeviationRuleRepository repo;

    @Override
    public DeviationRule createRule(DeviationRule rule) {
        return repo.save(rule);
    }

    @Override
    public DeviationRule updateRule(Long id, DeviationRule rule) {
        DeviationRule existing = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Rule not found"));
        rule.setId(existing.getId());
        return repo.save(rule);
    }

    @Override
    public List<DeviationRule> getAllRules() {
        return repo.findAll();
    }

    @Override
    public List<DeviationRule> getActiveRules() {
        return repo.findAll(); 
    }

    @Override
    public DeviationRule getRuleById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Rule not found"));
    }

    @Override
    public List<DeviationRule> getRulesBySurgery(String surgeryType) {
        return repo.findBySurgeryType(surgeryType);
    }
}
[12:18 pm, 21/12/2025] பிரியா 🦋: package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.DailySymptomLog;
import com.example.demo.repository.DailySymptomLogRepository;
import com.example.demo.service.DailySymptomLogService;
import com.example.demo.exception.ResourceNotFoundException;
import java.util.List;

@Service
public class DailySymptomLogServiceImpl implements DailySymptomLogService {

    @Autowired
    private DailySymptomLogRepository repo;

    @Override
    public DailySymptomLog recordLog(DailySymptomLog log) {
        return repo.save(log);
    }

    @Override
    public DailySymptomLog updateLog(Long id, DailySymptomLog log) {
        DailySymptomLog existing = getLogById(id);
        log.setId(existing.getId());
        return repo.save(log);
    }

    @Override
    public List<DailySymptomLog> getLogsByPatient(Long patientid) {
        return repo.findByPatient_Id(patientid);
    }

    @Override
    public DailySymptomLog getLogById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Log not found"));
    }

    @Override
    public List<DailySymptomLog> getAllLogs() {
        return repo.findAll();
    }
}
[12:18 pm, 21/12/2025] பிரியா 🦋: package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.ClinicalAlert;
import com.example.demo.repository.ClinicalAlertRepository;
import com.example.demo.service.ClinicalAlertService;
import com.example.demo.exception.ResourceNotFoundException;
import java.util.List;

@Service
public class ClinicalAlertServiceImpl implements ClinicalAlertService {

    @Autowired
    private ClinicalAlertRepository repo;

    @Override
    public ClinicalAlert createAlert(ClinicalAlert alert) {
        return repo.save(alert);
    }

    @Override
    public ClinicalAlert resolveAlert(Long id) {
        ClinicalAlert alert = getAlertById(id);
        alert.setResolved(true);
        return repo.save(alert);
    }

    @Override
    public List<ClinicalAlert> getAlertsByPatient(Long patientid) {
        return repo.findByPatient_Id(patientid);
    }

    @Override
    public ClinicalAlert getAlertById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Alert not found"));
    }

    @Override
    public List<ClinicalAlert> getAllAlerts() {
        return repo.findAll();
    }
}