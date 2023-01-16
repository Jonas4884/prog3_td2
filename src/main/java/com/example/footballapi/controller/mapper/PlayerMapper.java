package com.example.footballapi.controller.mapper;

import com.example.footballapi.controller.model.PlayerResponse;
import com.example.footballapi.model.PlayerEntity;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {
    public PlayerResponse toRest(PlayerEntity playerEntity) {
        return PlayerResponse.builder()
                .id(playerEntity.getId())
                .name(playerEntity.getName())
                .isGoalKeeper(playerEntity.isGoalKeeper())
                .build();
    }
}
