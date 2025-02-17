package com.example.sprint_boot_rest;

import com.example.sprint_boot_rest.model.JobPost;
import com.example.sprint_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Here, the CrossOrigin annotation overcomes the CORS policy implemented by the web browsers, in every method of this controller.
 * It basically indicates that the JavaScript hosted/served in the respective domain/origin is allowed to make request to the methods of this controller.
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class JobRestController {
    @Autowired
    private JobService jobService;

    @PostMapping("jobPost")
    public void addJobPost(@RequestBody JobPost jobPost) {
        jobService.addJob(jobPost);
    }

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId) {
        System.out.println(postId);
        return jobService.getJob(postId);
    }
}
