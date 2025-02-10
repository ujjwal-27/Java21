package com.example.JobApp.service;

import com.example.JobApp.model.JobPost;
import com.example.JobApp.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository repository;

    public void addJob(JobPost jobPost) {
        repository.addJob(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return repository.getAllJobs();
    }
}
