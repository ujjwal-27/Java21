package com.example.spring_data_rest_demo.repository;

import com.example.spring_data_rest_demo.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(path = "jobs")  // This creates custom path for API endpoint. By default, it used 'jobPosts'. Now, it will use 'jobs'.
public interface JobRepository extends JpaRepository<JobPost, Integer> {
//    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
}
