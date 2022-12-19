package com.prog3_td2.prog3.service;

import com.prog3_td2.prog3.model.PlayAgainst;
import com.prog3_td2.prog3.model.TeamEntity;
import com.prog3_td2.prog3.repository.PLayAgainstRepository;
import com.prog3_td2.prog3.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {
    private final TeamRepository teamRepository;
    private final PLayAgainstRepository repository;
    public List<PlayAgainst> getAllTeams(){
        return  repository.findAll();
    }
}
