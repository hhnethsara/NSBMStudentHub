package com.teamkavi.nsbmstudenthub.Model;

import jakarta.persistence.*;



    @Entity
    @Table(name = "students")
    public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @Column(unique = true, nullable = false)
        private String email;

        private String batch;
        private Double gpa;

        // Getters and Setters
    }

