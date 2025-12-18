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


public Long getid(){
    return  id;
}
public String getpatientid(){
    return patientid;
}
public String get
}