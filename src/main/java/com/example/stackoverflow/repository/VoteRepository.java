package com.example.stackoverflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stackoverflow.model.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
