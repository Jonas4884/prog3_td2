package com.example.footballapi.controller.mapper;

import com.example.footballapi.controller.model.PlayResponse;
import com.example.footballapi.model.GoalEntity;
import com.example.footballapi.model.PlayAgainst;
import com.example.footballapi.service.GoalService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PlayMatchMapper {
    private final PlayedTeamMapper playedTeamMapper;
    private final GoalService service;

    public PlayResponse toRest(PlayAgainst playedMatch) {
        GoalEntity goal = service.getMatchById(playedMatch.getId());

        return PlayResponse.builder()
                .id(playedMatch.getId())
                .datetime(playedMatch.getDatetime())
                .teamHome(playedTeamMapper.toRest(playedMatch.getTeamA(), goal.getId()))
                .teamAway(playedTeamMapper.toRest(playedMatch.getTeamB(), goal.getId()))
                .build();
    }
}
