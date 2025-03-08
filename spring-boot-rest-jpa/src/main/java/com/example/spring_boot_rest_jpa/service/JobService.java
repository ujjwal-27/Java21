package com.example.spring_boot_rest_jpa.service;

import com.example.spring_boot_rest_jpa.model.JobPost;
import com.example.spring_boot_rest_jpa.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public void addJob(JobPost jobPost) {
        jobRepository.save(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return jobRepository.findAll();
    }

    public JobPost getJob(int postId) {
        return jobRepository.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        jobRepository.save(jobPost);
    }

    public void deleteJob(int postId) {
        jobRepository.deleteById(postId);
    }
}
