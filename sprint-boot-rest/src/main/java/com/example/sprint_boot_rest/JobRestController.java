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

    /**
     * This method simply implements 'PostMapping' annotation.
     * The data received from request body in the method's parameter must be implemented with RequestBody annotation.
     * @param jobPost [JobPost] Job post data from request body.
     * @return [JobPost] Return recently added job post.
     */
    @PostMapping("jobPost")
    public JobPost addJobPost(@RequestBody JobPost jobPost) {
        jobService.addJob(jobPost);

        return jobService.getJob(jobPost.getPostId());
    }

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }

    /**
     *
     * @param postId [int] ID of job post to return. In parameter, annotation PathVariable is implemented to indicate that postId is sent from URI.
     * @return [JobPost] Return detail of a job post.
     */
    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId) {
        System.out.println(postId);
        return jobService.getJob(postId);
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        jobService.updateJob(jobPost);

        return jobService.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public void deleteJob(@PathVariable("postId") int postId) {
        jobService.deleteJob(postId);
    }
}
