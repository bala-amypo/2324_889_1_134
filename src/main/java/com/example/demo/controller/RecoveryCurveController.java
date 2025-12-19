package com.example.demo.controller;

import com.example.demo.model.RecoveryCurveProfile;
import com.example.demo.service.RecoveryCurveService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recovery-curves")
public class RecoveryCurveController {

    private final RecoveryCurveService service;

    public RecoveryCurveController(RecoveryCurveService service) {
        this.service = service;
    }

    public RecoveryCurveProfile createCurve(@RequestBody RecoveryCurveProfile curve) {
        return service.createCurveEntry(curve);
    }

    @GetMapping("/{id}")
    public RecoveryCurveProfile getById(@PathVariable Long id) {
        return service.getCurveById(id);
    }

    @GetMapping("/surgery/{surgeryType}")
    public RecoveryCurveProfile getBySurgery(@PathVariable String surgeryType) {
        return service.getCurveForSurgery(surgeryType);
    }

    @GetMapping
    public List<RecoveryCurveProfile> getAll() {
        return service.getAllCurves();
    }
}
