package com.example.footballapi.controller.mapper;

import com.example.footballapi.controller.model.PlayerResponse;
import com.example.footballapi.controller.model.SponsorResponse;
import com.example.footballapi.controller.model.TeamResponse;
import com.example.footballapi.model.TeamEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class TeamMapper {
    private final PlayerMapper playerMapper;
    private final SponsorMapper sponsorMapper;

    public TeamResponse toRest(TeamEntity team) {
        List<PlayerResponse> allPlayers = team.getPlayers().stream().map(playerMapper::toRest).toList();
        List<SponsorResponse> allSponsors = team.getSponsors().stream().map(sponsorMapper::toRest).toList();

        return TeamResponse.builder()
                .id(team.getId())
                .name(team.getName())
                .sponsors(allSponsors)
                .players(allPlayers)
                .build();
    }
}
