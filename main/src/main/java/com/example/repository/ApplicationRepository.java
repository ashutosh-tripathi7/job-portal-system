package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Application;
import com.example.model.Job;
import com.example.model.User;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
    List<Application> findByCandidate(User candidate);
    List<Application> findByJob(Job job);
}
