package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class DailySymptomLog {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private PatientProfile patient;

    private LocalDate logDate;
    private Integer painLevel;
    private Integer mobilityLevel;
    private Integer fatigueLevel;
    private String notes;
    private LocalDateTime submittedAt;

    public DailySymptomLog(Integer fatigueLevel, Long id, LocalDate logDate,
                           Integer mobilityLevel, String notes,
                           Integer painLevel, PatientProfile patient,
                           LocalDateTime submittedAt) {
        this.fatigueLevel = fatigueLevel;
        this.id = id;
        this.logDate = logDate;
        this.mobilityLevel = mobilityLevel;
        this.notes = notes;
        this.painLevel = painLevel;
        this.patient = patient;
        this.submittedAt = submittedAt;
    }

    public DailySymptomLog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PatientProfile getPatient() {
        return patient;
    }

    public void setPatient(PatientProfile patient) {
        this.patient = patient;
    }

    public LocalDate getLogDate() {
        return logDate;
    }

    public void setLogDate(LocalDate logDate) {
        this.logDate = logDate;
    }

    public Integer getPainLevel() {
        return painLevel;
    }

    public void setPainLevel(Integer painLevel) {
        this.painLevel = painLevel;
    }

    public Integer getMobilityLevel() {
        return mobilityLevel;
    }

    public void setMobilityLevel(Integer mobilityLevel) {
        this.mobilityLevel = mobilityLevel;
    }

    public Integer getFatigueLevel() {
        return fatigueLevel;
    }

    public void setFatigueLevel(Integer fatigueLevel) {
        this.fatigueLevel = fatigueLevel;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }
}
