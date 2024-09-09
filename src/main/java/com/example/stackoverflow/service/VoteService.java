package com.example.stackoverflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stackoverflow.model.Vote;
import com.example.stackoverflow.repository.VoteRepository;

@Service
public class VoteService {

    @Autowired
    private VoteRepository voteRepository;

    public Vote castVote(Vote vote) {
        return voteRepository.save(vote);
    }
}
