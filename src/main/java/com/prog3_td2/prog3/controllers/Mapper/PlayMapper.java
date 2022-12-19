package com.prog3_td2.prog3.controllers.Mapper;

import com.prog3_td2.prog3.controllers.formatter.hourFormatter;
import com.prog3_td2.prog3.controllers.response.PlayResponse;
import com.prog3_td2.prog3.model.PlayAgainst;

public class PlayMapper {
    public static PlayResponse toRest(PlayAgainst playAgainst){
        String PlayingTime = hourFormatter.customformat(playAgainst.getDateTime());
        return PlayResponse.builder()
                .id(playAgainst.getId())
                .datetime(PlayingTime)
                .team1(playAgainst.getTeam1().getName())
                .team2(playAgainst.getTeam2().getName())
                .build();
    }
}
