package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
public class DeviationRule {

    @Id
    @GeneratedValue
    private Long id;

    private String surgeryType;
    private String symptomParameter;
    private Integer thresholdDeviation;
    private Boolean active;

    public DeviationRule(Long id, String surgeryType, String symptomParameter,
                         Integer thresholdDeviation, Boolean active) {
        this.id = id;
        this.surgeryType = surgeryType;
        this.symptomParameter = symptomParameter;
        this.thresholdDeviation = thresholdDeviation;
        this.active = active;
    }

    public DeviationRule() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurgeryType() {
        return surgeryType;
    }

    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }

    public String getSymptomParameter() {
        return symptomParameter;
    }

    public void setSymptomParameter(String symptomParameter) {
        this.symptomParameter = symptomParameter;
    }

    public Integer getThresholdDeviation() {
        return thresholdDeviation;
    }

    public void setThresholdDeviation(Integer thresholdDeviation) {
        this.thresholdDeviation = thresholdDeviation;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
