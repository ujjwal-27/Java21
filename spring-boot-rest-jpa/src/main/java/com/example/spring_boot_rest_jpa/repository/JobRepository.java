package com.example.spring_boot_rest_jpa.repository;

import com.example.spring_boot_rest_jpa.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<JobPost, Integer> {

}
