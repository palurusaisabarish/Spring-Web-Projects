package com.NextEducation.JobApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.NextEducation.JobApp.JobPost;
import com.NextEducation.JobApp.Service.HomeSerivce;


@Controller
public class HomeContoller {

    @Autowired
    private HomeSerivce service;

    @GetMapping({"/","homepage"})
    public String addHome() {
        return "home";
    }

    @GetMapping("/addjob")
    public String addjob() {
        return "addjob";
    }

    @PostMapping("handleform")
    public String handleform(@ModelAttribute JobPost jobpost, Model m) {
        service.addJob(jobpost);
        m.addAttribute("jobPost", jobpost);
        return "success";
    }

    @GetMapping("viewjobs")
    public String viewJobs(Model model) {
        List<JobPost> allJobs = service.getAllJobs();
        model.addAttribute("allJobs", allJobs);
        return "viewjobs";
    }
}