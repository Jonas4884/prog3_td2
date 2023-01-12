package com.prog3_td2.prog3.controllers.Mapper;

import com.prog3_td2.prog3.controllers.formatter.hourFormatter;
import com.prog3_td2.prog3.controllers.response.PlayMatchResponse;
import com.prog3_td2.prog3.controllers.response.ScoreResponse;
import com.prog3_td2.prog3.model.PlayerEntity;
import com.prog3_td2.prog3.model.Score;

public class ScoreMapper {
    public static ScoreResponse toRest(Score score){
        String toScoreTime = hourFormatter.customScore(score.getScoringTime());
        PlayMatchResponse playMatchResponse = new PlayMatchResponse(score.getPlayer().getId(),score.getPlayer().getName(),score.getPlayer().getPost(),score.getPlayer().getTeam().getName());
        return ScoreResponse.builder()
                .id(score.getId())
                .scorer(playMatchResponse)
                .scoringTime(toScoreTime)
                .build();
    }
}
