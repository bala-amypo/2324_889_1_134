package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

import java.time.LocalDate;

@Entity
public class ClinicalAlert {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private PatientProfile patient;

    private LocalDate alertDate;

    @Enumerated(EnumType.STRING)
    private Severity severity;

    private boolean resolved;

    public ClinicalAlert(Long id, PatientProfile patient,
                          LocalDate alertDate, Severity severity,
                          boolean resolved) {
        this.id = id;
        this.patient = patient;
        this.alertDate = alertDate;
        this.severity = severity;
        this.resolved = resolved;
    }

    public ClinicalAlert() {
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

    public LocalDate getAlertDate() {
        return alertDate;
    }

    public void setAlertDate(LocalDate alertDate) {
        this.alertDate = alertDate;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }
}
