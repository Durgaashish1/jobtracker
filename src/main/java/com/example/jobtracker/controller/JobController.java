package com.example.jobtracker.controller;

import com.example.jobtracker.model.Job;
import com.example.jobtracker.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping
    public ResponseEntity<List<Job>> getAllJobs() {
        List<Job> jobs = jobService.getAllJobs();
        return ResponseEntity.ok(jobs);
    }

    @PostMapping
    public ResponseEntity<?> addJob(@RequestBody Job job) {
        jobService.saveJob(job);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    // Other controller methods like updating job status, deleting job, etc.
}