package com.mohan.firstjobapp.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mohan.firstjobapp.job.Job;
import com.mohan.firstjobapp.review.Review;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Job> Jobs;
    @OneToMany(mappedBy = "company")
    private List<Review> reviews;


    public Company() {
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return Jobs;
    }

    public void setJobs(List<Job> jobs) {
        Jobs = jobs;
    }
}
