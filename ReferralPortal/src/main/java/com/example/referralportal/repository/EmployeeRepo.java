package com.example.referralportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.referralportal.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
