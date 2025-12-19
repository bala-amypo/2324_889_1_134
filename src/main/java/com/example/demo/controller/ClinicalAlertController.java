package com.example.demo.controller;

import com.example.demo.model.ClinicalAlert;
import com.example.demo.service.ClinicalAlertService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alerts")
public class ClinicalAlertController {

    private final ClinicalAlertService service;

    public ClinicalAlertController(ClinicalAlertService service) {
        this.service = service;
    }

    // POST /api/alerts
    @PostMapping
    public ClinicalAlert createAlert(@RequestBody ClinicalAlert alert) {
        return service.createAlert(alert);
    }

    // PUT /api/alerts/{id}/resolve
    @PutMapping("/{id}/resolve")
    public ClinicalAlert resolveAlert(@PathVariable Long id) {
        return service.resolveAlert(id);
    }

    // GET /api/alerts/patient/{patientId}
    @GetMapping("/patient/{patientId}")
    public List<ClinicalAlert> getByPatient(@PathVariable Long patientId) {
        return service.getAlertsByPatient(patientId);
    }

    // GET /api/alerts/{id}
    @GetMapping("/{id}")
    public ClinicalAlert getById(@PathVariable Long id) {
        return service.getAlertById(id);
    }

    // GET /api/alerts
    @GetMapping
    public List<ClinicalAlert> getAll() {
        return service.getAllAlerts();
    }
}
