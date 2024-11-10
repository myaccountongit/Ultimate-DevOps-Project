package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Building an Automated CI/CD Pipeline");
        model.addAttribute("msg", "This application is deployed into Kubernetes using Argo CD");
        model.addAttribute("par1", "Successfully developed and deployed a comprehensive CI/CD Pipeline with automation capabilities using Java technologies.");
        model.addAttribute("par2", "This automated pipeline integrates continuous integration (CI) and continuous deployment (CD) methodologies, ensuring rapid, reliable, and consistent software delivery.");
        model.addAttribute("par3", "Utilizing best practices and tools, this solution optimizes development workflows, enhances collaboration, and enables efficient testing and deployment of applications.");    
        model.addAttribute("par4", "With a focus on efficiency and quality, this CI/CD Pipeline automates build, test, and deployment processes, allowing seamless delivery of applications across various environments.");   
            
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
