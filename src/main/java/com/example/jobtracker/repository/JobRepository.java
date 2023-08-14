package com.example.jobtracker.repository;

import com.example.jobtracker.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    // You can add custom query methods here if needed
}