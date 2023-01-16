package com.example.footballapi.service;

import com.example.footballapi.model.PlayAgainst;
import com.example.footballapi.repository.MatchRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MatchService {
    private final MatchRepository repository;

    public List<PlayAgainst> getAllMatch() {
       return repository.findAll();
    }
}
