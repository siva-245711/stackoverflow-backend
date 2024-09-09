package com.example.stackoverflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stackoverflow.model.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}