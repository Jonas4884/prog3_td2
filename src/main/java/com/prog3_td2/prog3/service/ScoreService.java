package com.prog3_td2.prog3.service;


import com.prog3_td2.prog3.model.Score;
import com.prog3_td2.prog3.repository.ScoreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ScoreService {
    private final ScoreRepository repository;

    public List<Score> getAllSCore(){return repository.findAll();}
}
