package com.example.spring_boot_rest_jpa.repository;

import com.example.spring_boot_rest_jpa.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<JobPost, Integer> {

}

//List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//        new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2, Arrays.asList("Core Java", "J2EE", "Spring Boot", "Hibernate")),
//        new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3, Arrays.asList("HTML", "CSS", "JavaScript", "React")),
//        new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4, Arrays.asList("Python", "Machine Learning", "Data Analysis")),
//        new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5, Arrays.asList("Networking", "Cisco", "Routing", "Switching")),
//        new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3, Arrays.asList("iOS Development", "Android Development", "Mobile App"))
//));
//
//public List<JobPost> getAllJobs() {
//    return jobs;
//}
//
//public void addJob(JobPost job) {
//    jobs.add(job);
//}
//
//public JobPost getJob(int postId) {
//    for (JobPost job: jobs) {
//        if (job.getPostId() == postId) {
//            return job;
//        }
//    }
//
//    return null;
//}
//
//public void updateJob(JobPost jobPost) {
//    for (JobPost job: jobs) {
//        if (job.getPostId() == jobPost.getPostId()) {
//            job.setPostProfile(jobPost.getPostProfile());
//            job.setPostDesc(jobPost.getPostDesc());
//            job.setReqExperience(jobPost.getReqExperience());
//            job.setPostTechStack(jobPost.getPostTechStack());
//        }
//    }
//}
//
///**
// * APPROACH - 1: Here, removeIf() method use lambda approach to remove job from the list. (Recommended for removing element while iterating through list)
// * APPROACH - 2: Here, 'Iterator' allows safe traversal and modification during iteration.
// * APPROACH - 3: Here, Using general for-loop.
// * @param postId [int] ID of jobPost to delete
// */
//public void deleteJob(int postId) {
//    // APPROACH - 1
//    jobs.removeIf(job -> job.getPostId() == postId);

    // APPROACH - 2
//        Iterator<JobPost> jobPostIterator = jobs.iterator();
//
//        while (jobPostIterator.hasNext()) {
//            if (jobPostIterator.next().getPostId() == postId) {
//                jobPostIterator.remove();
//            }
//        }

    // APPROACH - 3
//        for (int i = 0; i < jobs.size(); i++) {
//            if (jobs.get(i).getPostId() == postId) {
//                jobs.remove(i);
//            }
//        }
//}
