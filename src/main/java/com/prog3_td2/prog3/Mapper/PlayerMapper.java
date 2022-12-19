package com.prog3_td2.prog3.Mapper;

import com.prog3_td2.prog3.controllers.response.PlayerResponse;
import com.prog3_td2.prog3.model.PlayerEntity;

public class PlayerMapper {
    public static PlayerResponse toRest(PlayerEntity playerEntity){
        return PlayerResponse.builder()
                .id(playerEntity.getId())
                .name(playerEntity.getName())
                .team(playerEntity.getTeam().getName())
                .build();
    }
}
