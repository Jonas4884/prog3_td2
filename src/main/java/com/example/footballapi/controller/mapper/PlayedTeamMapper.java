package com.example.footballapi.controller.mapper;

import com.example.footballapi.controller.model.PlayedTeamResponse;
import com.example.footballapi.controller.model.PlayerResponse;
import com.example.footballapi.controller.model.SponsorResponse;
import com.example.footballapi.model.ScoreEntity;
import com.example.footballapi.model.TeamEntity;
import com.example.footballapi.service.ScoreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PlayedTeamMapper {

    private final PlayerMapper playerMapper;
    private final SponsorMapper sponsorMapper;
    private final ScoreMapper scoreMapper;
    private final ScoreService scoreService;


    public PlayedTeamResponse toRest(TeamEntity teamEntity, long goalId) {
        List<PlayerResponse> allPlayers = teamEntity.getPlayers().stream().map(playerMapper::toRest).toList();
        List<SponsorResponse> allSponsors = teamEntity.getSponsors().stream().map(sponsorMapper::toRest).toList();

        List<ScoreEntity> allScorers = scoreService.getScorersByTeamId(goalId, teamEntity.getId());

        return PlayedTeamResponse.builder()
                .id(teamEntity.getId())
                .name(teamEntity.getName())
                .sponsors(allSponsors)
                .players(allPlayers)
                .scorers(allScorers.stream().map(scoreMapper::toRest).toList())
                .goals(allScorers.size())
                .build();
    }
}
