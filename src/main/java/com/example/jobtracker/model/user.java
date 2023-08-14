package com.example.jobtracker.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    // Other user-related fields (e.g., name, email, roles, etc.)

    // Getters and setters

    // Constructors (default and parameterized)

    // Other methods if needed
}