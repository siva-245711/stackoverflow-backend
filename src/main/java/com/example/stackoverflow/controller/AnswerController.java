package com.example.stackoverflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stackoverflow.model.Answer;
import com.example.stackoverflow.service.AnswerService;

@RestController
@RequestMapping("/api/answers")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @PostMapping
    public ResponseEntity<Answer> postAnswer(@RequestBody Answer answer) {
        return ResponseEntity.ok(answerService.postAnswer(answer));
    }
}