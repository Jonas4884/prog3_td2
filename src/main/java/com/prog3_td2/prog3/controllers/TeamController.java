package com.prog3_td2.prog3.controllers;

import com.prog3_td2.prog3.controllers.Mapper.PlayMapper;
import com.prog3_td2.prog3.controllers.Mapper.TeamMapper;
import com.prog3_td2.prog3.controllers.response.PlayResponse;
import com.prog3_td2.prog3.controllers.response.TeamResponse;
import com.prog3_td2.prog3.model.TeamEntity;
import com.prog3_td2.prog3.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;
    @GetMapping("/match")
    public List<PlayResponse> getAllMatch(){
        return service.getAllMatch().stream().map(PlayMapper::toRest).toList();
    }

    @GetMapping("/team")
    public List<TeamResponse>getAllTeams(){
        return service.getAllTeams().stream().map(TeamMapper::toRest).toList();
    }

    @GetMapping("/team/{team}")
    public TeamResponse getTeamByName(@PathVariable String team) {
        return service.getTeamByName(team);
    }

}
