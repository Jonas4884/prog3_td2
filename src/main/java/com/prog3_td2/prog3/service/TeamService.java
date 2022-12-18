package com.prog3_td2.prog3.service;

import com.prog3_td2.prog3.model.TeamEntity;
import com.prog3_td2.prog3.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {
    private final TeamRepository teamRepository;
    public List<TeamEntity> getAllTeams(){
        return  teamRepository.findAll();
    }
}
