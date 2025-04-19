package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Job;
import com.example.model.User;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findByEmployer(User employer);
    List<Job> findByLocation(String location);
}
