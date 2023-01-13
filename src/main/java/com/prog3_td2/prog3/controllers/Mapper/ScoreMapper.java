package com.prog3_td2.prog3.controllers.Mapper;

import com.prog3_td2.prog3.controllers.formatter.hourFormatter;
import com.prog3_td2.prog3.controllers.Response.PlayMatchResponse;
import com.prog3_td2.prog3.controllers.Response.ScoreResponse;
import com.prog3_td2.prog3.model.Score;

public class ScoreMapper {
    public static ScoreResponse toRest(Score score){
        String toScoreTime = hourFormatter.customScore(score.getScoringTime());
        PlayMatchResponse playMatchResponse = new PlayMatchResponse(score.getPlayer().getId(),score.getPlayer().getName(),score.getPlayer().getPost());
        return ScoreResponse.builder()
                .id(score.getId())
                .scorer(playMatchResponse)
                .scoringTime(toScoreTime)
                .build();
    }
}
