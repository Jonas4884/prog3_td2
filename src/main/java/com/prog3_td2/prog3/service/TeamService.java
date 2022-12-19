package com.prog3_td2.prog3.service;

import com.prog3_td2.prog3.controllers.Mapper.SponsorisedMapper;
import com.prog3_td2.prog3.controllers.response.TeamResponse;
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
    public List<PlayAgainst> getAllMatch(){
        return  repository.findAll();
    }

    public List<TeamEntity> getAllTeams(){
        return teamRepository.findAll();
    }

    public TeamResponse getTeamByName(String name){
        TeamResponse teamResponse = new TeamResponse();
        TeamEntity team = teamRepository.findByName(name);
        teamResponse.setId(team.getId());
        teamResponse.setName(team.getName());
        teamResponse.setPlayer(team.getPlayerEntity().stream().map(SponsorisedMapper::toPlayerName).toList());
        teamResponse.setSponsors(team.getSponsorEntity().stream().map(SponsorisedMapper::toSponsorName).toList());

        return teamResponse;
    }


}
