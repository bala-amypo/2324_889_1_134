package com.example.demo.model;
import jakarta.persistence.Id;

public class ClinicalAlert {
    @Id
    private Long id;
    private PaitentProfile paitent;
    private LocalDate alterDate;
    private Severity severity; 
    private boolean resolved;
    
    public ClinicalAlert(Long id, PaitentProfile paitent, LocalDate alterDate, Severity severity, boolean resolved) {
        this.id = id;
        this.paitent = paitent;
        this.alterDate = alterDate;
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

    public PaitentProfile getPaitent() {
        return paitent;
    }

    public void setPaitent(PaitentProfile paitent) {
        this.paitent = paitent;
    }

    public LocalDate getAlterDate() {
        return alterDate;
    }

    public void setAlterDate(LocalDate alterDate) {
        this.alterDate = alterDate;
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
