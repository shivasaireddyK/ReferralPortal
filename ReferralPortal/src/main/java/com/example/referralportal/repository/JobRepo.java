package com.example.referralportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.referralportal.entity.Job;

public interface JobRepo extends JpaRepository<Job, Integer> {

}
