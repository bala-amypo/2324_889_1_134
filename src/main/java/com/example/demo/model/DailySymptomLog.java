



package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecoveryCurveProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String surgeryType;

    @Positive
    private Integer dayNumber;

    @Positive
    private Integer expectedPainLevel;

    @Positive
    private Integer expectedMobilityLevel;

    @Positive
    private Integer expectedFatigueLevel;
}


package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String surgeryType;

    @NotNull
    private String symptomParameter;

    @Positive(message = "Threshold must be positive")
    private Integer thresholdDeviation;

    @NotNull
    private Boolean active;
}

package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DailySymptomLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @NotNull
    private PatientProfile patient;

    @NotNull
    private LocalDate logDate;

    @Positive
    private Integer painLevel;

    @Positive
    private Integer mobilityLevel;

    @Positive
    private Integer fatigueLevel;

    @Size(max = 255)
    private String notes;

    private LocalDateTime submittedAt;
}
