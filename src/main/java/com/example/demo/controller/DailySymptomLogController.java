package com.example.demo.controller;

import com.example.demo.model.DailySymptomLog;
import com.example.demo.service.DailySymptomLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/symptom-logs")
public class DailySymptomLogController {

    private final DailySymptomLogService service;

    public DailySymptomLogController(DailySymptomLogService service) {
        this.service = service;
    }

    // POST /api/symptom-logs
    @PostMapping
    public DailySymptomLog recordLog(@RequestBody DailySymptomLog log) {
        return service.recordLog(log);
    }

    // PUT /api/symptom-logs/{id}
    @PutMapping("/{id}")
    public DailySymptomLog updateLog(
            @PathVariable Long id,
            @RequestBody DailySymptomLog log) {

        return service.updateLog(id, log);
    }

    // GET /api/symptom-logs/patient/{patientId}
    @GetMapping("/patient/{patientId}")
    public List<DailySymptomLog> getByPatient(@PathVariable Long patientId) {
        return service.getLogsByPatient(patientId);
    }

    // GET /api/symptom-logs/{id}
    @GetMapping("/{id}")
    public DailySymptomLog getById(@PathVariable Long id) {
        return service.getLogById(id);
    }

    // GET /api/symptom-logs
    @GetMapping
    public List<DailySymptomLog> getAll() {
        return service.getAllLogs();
    }
}
