package com.example.jobtracker.service;

import com.example.jobtracker.model.Job;

import java.util.List;

public interface JobService {
    List<Job> getAllJobs();
    void saveJob(Job job);
    // Other job-related methods if needed
}