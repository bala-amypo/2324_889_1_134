package com.example.demo.model;
import jakarta.persistence.Id;

public class PaitentProfile {
    @Id
    private Long id;
    @column(name=unique)
    private String patientid;
    private String fullname;
    private int age;
    @column(name=unique)
    private String email;
    private String surgeryType;
    private boolean active;
    private LocalDate createdAt;

public PaitentProfile(Long id, String patientid, String fullname, int age, String email, String surgeryType,
            boolean active, LocalDate createdAt) {
        this.id = id;
        this.patientid = patientid;
        this.fullname = fullname;
        this.age = age;
        this.email = email;
        this.surgeryType = surgeryType;
        this.active = active;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurgeryType() {
        return surgeryType;
    }

    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public PaitentProfile() {
    }

}
