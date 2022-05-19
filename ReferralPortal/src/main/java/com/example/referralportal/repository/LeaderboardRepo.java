package com.example.referralportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.referralportal.entity.Leaderboard;

public interface LeaderboardRepo extends JpaRepository<Leaderboard, Integer> {

}
