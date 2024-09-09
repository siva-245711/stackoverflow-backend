package com.example.stackoverflow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.stackoverflow.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    @Query("SELECT q FROM Question q WHERE LOWER(q.title) LIKE LOWER(CONCAT('%', :keyword, '%')) OR LOWER(q.body) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Question> searchQuestions(String keyword);
}