package com.prog3_td2.prog3.controllers.Mapper;

import com.prog3_td2.prog3.controllers.Response.TeamResponse;
import com.prog3_td2.prog3.model.TeamEntity;

public class TeamMapper {
    public static TeamResponse toRest (TeamEntity team){
        return TeamResponse.builder()
                .id(team.getId())
                .name(team.getName())
                .Player(team.getPlayerEntity().stream().map(PlayerMatchMapper::toRest).toList())
                .sponsors(team.getSponsorEntity())
                .build();
    }
}
