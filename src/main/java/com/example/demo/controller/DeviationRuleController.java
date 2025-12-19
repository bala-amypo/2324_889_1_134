package com.example.demo.controller;

import com.example.demo.model.DeviationRule;
import com.example.demo.service.DeviationRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deviation-rules")
public class DeviationRuleController {

    private final DeviationRuleService service;

    public DeviationRuleController(DeviationRuleService service) {
        this.service = service;
    }

    // POST /api/deviation-rules
    @PostMapping
    public DeviationRule createRule(@RequestBody DeviationRule rule) {
        return service.createRule(rule);
    }

    // PUT /api/deviation-rules/{id}
    @PutMapping("/{id}")
    public DeviationRule updateRule(
            @PathVariable Long id,
            @RequestBody DeviationRule rule) {

        return service.updateRule(id, rule);
    }

    // GET /api/deviation-rules/active
    @GetMapping("/active")
    public List<DeviationRule> getActiveRules() {
        return service.getActiveRules();
    }

    // GET /api/deviation-rules/{id}
    @GetMapping("/{id}")
    public DeviationRule getById(@PathVariable Long id) {
        return service.getRuleById(id);
    }

    // GET /api/deviation-rules
    @GetMapping
    public List<DeviationRule> getAll() {
        return service.getAllRules();
    }
}
