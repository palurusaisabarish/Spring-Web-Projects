package com.NextEducation.JobApp.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NextEducation.JobApp.JobPost;
import com.NextEducation.JobApp.Service.HomeSerivce;

@RestController
@RequestMapping("/api")
public class JobPostApiController {

    @Autowired
    private HomeSerivce service;

    @GetMapping("jobposts")
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping("jobpost/{postId}")
    public JobPost getJob(@PathVariable Integer postId) {
        return service.getJob(postId);
    }

    @PostMapping("jobpost")
    public JobPost addJob(@RequestBody JobPost jobpost) {
        service.addJob(jobpost);
        return service.getJob(jobpost.getPostId());
    }

    @PutMapping("jobpost")
    public JobPost updateJobPost(@RequestBody JobPost jobpost) {
        service.updateJob(jobpost);
        return service.getJob(jobpost.getPostId());
    }

    @DeleteMapping("jobpost/{postId}")
    public String deleteJob(@PathVariable int postId) {
        service.deleteJob(postId);
        return "deleted";
    }

    @PostMapping("load")
    public String load() {
        service.load();
        return "success";
    }

    @GetMapping("/jobposts/keyword/{keyword}")
    public List<JobPost> searchByKeyWord(@PathVariable("keyword") String keyword){
        return service.search(keyword);
    }
}