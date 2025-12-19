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

    @PostMapping
    public DeviationRule createRule(@RequestBody DeviationRule rule) {
        return service.createRule(rule);
    }

    @PutMapping("/{id}")
    public DeviationRule updateRule(
            @PathVariable Long id,
            @RequestBody DeviationRule rule) {

        return service.updateRule(id, rule);
    }

    @GetMapping("/active")
    public List<DeviationRule> getActiveRules() {
        return service.getActiveRules();
    }

    @GetMapping("/{id}")
    public DeviationRule getById(@PathVariable Long id) {
        return service.getRuleById(id);
    }

    @GetMapping
    public List<DeviationRule> getAll() {
        return service.getAllRules();
    }
}
