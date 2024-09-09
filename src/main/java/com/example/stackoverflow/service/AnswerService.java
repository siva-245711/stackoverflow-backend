package com.example.stackoverflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stackoverflow.model.Answer;
import com.example.stackoverflow.repository.AnswerRepository;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    public Answer postAnswer(Answer answer) {
        return answerRepository.save(answer);
    }
}
