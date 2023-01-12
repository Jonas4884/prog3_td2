package com.prog3_td2.prog3.controllers.Mapper;

import com.prog3_td2.prog3.controllers.formatter.hourFormatter;
import com.prog3_td2.prog3.controllers.response.PlayResponse;
import com.prog3_td2.prog3.controllers.response.PlayerResponse;
import com.prog3_td2.prog3.controllers.response.ScoreResponse;
import com.prog3_td2.prog3.controllers.response.TeamResponse;
import com.prog3_td2.prog3.model.PlayAgainst;
import com.prog3_td2.prog3.model.Score;

import java.util.List;

public class PlayMapper {
    public static PlayResponse toRest(PlayAgainst playAgainst){
        String PlayingTime = hourFormatter.customformat(playAgainst.getDateTime());
        TeamResponse team1 = new TeamResponse(playAgainst.getId(), playAgainst.getTeam1().getName(),playAgainst.getTeam1().getSponsorEntity(),playAgainst.getTeam1().getPlayerEntity().stream().map(PlayerMatchMapper::toRest).toList());
        TeamResponse team2 = new TeamResponse(playAgainst.getId(), playAgainst.getTeam2().getName(),playAgainst.getTeam2().getSponsorEntity(),playAgainst.getTeam2().getPlayerEntity().stream().map(PlayerMatchMapper::toRest).toList());
               return PlayResponse.builder()
                .id(playAgainst.getId())
                .datetime(PlayingTime)
                .Home(team1)
                .Away(team2)
                .score(playAgainst.getScore())
                .build();
    }
}
