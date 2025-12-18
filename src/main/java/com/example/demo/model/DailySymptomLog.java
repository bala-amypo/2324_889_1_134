package com.example.demo.model

public class DailySymptomLog {
    @Id
    private Long id;
    private PaitentProfile paitent;
    private LocalDate logDate;
    private int painLevel;
    private int mobilityLevel;
    private int fatigueLevel;
    private String notes;
    private LocalDateTime submittedAt;

    public DailySymptomLog(int fatigueLevel, Long id, LocalDate logDate, int mobilityLevel, String notes, int painLevel, PaitentProfile paitent, LocalDateTime submittedAt) {
        this.fatigueLevel = fatigueLevel;
        this.id = id;
        this.logDate = logDate;
        this.mobilityLevel = mobilityLevel;
        this.notes = notes;
        this.painLevel = painLevel;
        this.paitent = paitent;
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

    public PaitentProfile getPaitent() {
        return paitent;
    }

    public void setPaitent(PaitentProfile paitent) {
        this.paitent = paitent;
    }

    public LocalDate getLogDate() {
        return logDate;
    }

    public void setLogDate(LocalDate logDate) {
        this.logDate = logDate;
    }

    public int getPainLevel() {
        return painLevel;
    }

    public void setPainLevel(int painLevel) {
        this.painLevel = painLevel;
    }

    public int getMobilityLevel() {
        return mobilityLevel;
    }

    public void setMobilityLevel(int mobilityLevel) {
        this.mobilityLevel = mobilityLevel;
    }

    public int getFatigueLevel() {
        return fatigueLevel;
    }

    public void setFatigueLevel(int fatigueLevel) {
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
