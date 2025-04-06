package com.martinnnachi.jobportal.services;

import com.martinnnachi.jobportal.entity.JobSeekerProfile;
import com.martinnnachi.jobportal.repository.JobSeekerProfileRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobSeekerProfileService {

    private final JobSeekerProfileRepository jobSeekerProfileRepository;

    public JobSeekerProfileService(JobSeekerProfileRepository jobSeekerProfileRepository) {
        this.jobSeekerProfileRepository = jobSeekerProfileRepository;
    }

    public Optional<JobSeekerProfile> getOne(Integer id) {

        return jobSeekerProfileRepository.findById(id);

    }

    public JobSeekerProfile addNew(JobSeekerProfile jobSeekerProfile) {
        return jobSeekerProfileRepository.save(jobSeekerProfile);
    }
}
