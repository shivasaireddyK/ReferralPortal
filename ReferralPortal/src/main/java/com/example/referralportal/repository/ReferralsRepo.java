package com.example.referralportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.referralportal.entity.Referrals;

public interface ReferralsRepo extends JpaRepository<Referrals, Integer> {

}
