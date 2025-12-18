package com.example.demo.model;
import jakarta.persistence.Id;

public class DeviationRule{
    @Id
    private Long id;
    private String surgeryType;
    private String symptomParameter;
    private int thresholdDeviation;
    private int mobilityLevel;
    private boolean active;

    
    public DeviationRule(Long id, String surgeryType, String symptomParameter, int thresholdDeviation,
            int mobilityLevel, boolean active) {
        this.id = id;
        this.surgeryType = surgeryType;
        this.symptomParameter = symptomParameter;
        this.thresholdDeviation = thresholdDeviation;
        this.mobilityLevel = mobilityLevel;
        this.active = active;
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


    public int getThresholdDeviation() {
        return thresholdDeviation;
    }


    public void setThresholdDeviation(int thresholdDeviation) {
        this.thresholdDeviation = thresholdDeviation;
    }


    public int getMobilityLevel() {
        return mobilityLevel;
    }


    public void setMobilityLevel(int mobilityLevel) {
        this.mobilityLevel = mobilityLevel;
    }


    public boolean isActive() {
        return active;
    }


    public void setActive(boolean active) {
        this.active = active;
    }


    public DeviationRule() {
    }
   

 
}