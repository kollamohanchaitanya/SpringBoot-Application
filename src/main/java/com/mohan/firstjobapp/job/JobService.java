package com.mohan.firstjobapp.job;
import java.util.List;
public interface JobService {
    List<Job> findAll();
    void createJob(Job job);

    Job getJobId(Long id);

    Boolean deleteJobById(Long id);


    boolean UpdateJob(Long id, Job updatedJob);

}
