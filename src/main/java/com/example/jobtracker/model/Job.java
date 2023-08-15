package com.example.jobtracker.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "jobs")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false)
    private String position;

    @Column(nullable = false)
    private LocalDate applicationDeadline;

    // Other job-related fields (e.g., applicationStatus, interviewDate, etc.)

    // Getters and setters

    // Constructors (default and parameterized)

    // Other methods if needed
}