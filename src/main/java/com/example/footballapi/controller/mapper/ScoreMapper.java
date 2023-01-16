package com.example.footballapi.controller.mapper;

import com.example.footballapi.controller.model.ScoreResponse;
import com.example.footballapi.model.ScoreEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ScoreMapper {
    private final PlayerMapper playerMapper;

    public ScoreResponse toRest(ScoreEntity score) {
        return ScoreResponse.builder()
                .id(score.getId())
                .scoreTime(score.getScoringTime())
                .isOG(score.isOG())
                .player(playerMapper.toRest(score.getPlayer()))
                .build();
    }
}

