package com.prog3_td2.prog3.controllers.Mapper;

import com.prog3_td2.prog3.controllers.Response.PlayerResponse;
import com.prog3_td2.prog3.controllers.Response.ScoreResponse;
import com.prog3_td2.prog3.controllers.formatter.hourFormatter;
import com.prog3_td2.prog3.controllers.Response.PlayResponse;
import com.prog3_td2.prog3.controllers.Response.TeamResponse;
import com.prog3_td2.prog3.model.PlayAgainst;
import com.prog3_td2.prog3.model.Score;

import java.util.ArrayList;
import java.util.List;

public class PlayMapper {
    public static PlayResponse toRest(PlayAgainst playAgainst){
        String playingTime = hourFormatter.customformat(playAgainst.getDateTime());

        TeamResponse team1 = new TeamResponse(playAgainst.getId(), playAgainst.getTeam1().getName(),playAgainst.getTeam1().getSponsorEntity(),playAgainst.getTeam1().getPlayerEntity().stream().map(PlayerMatchMapper::toRest).toList());
        TeamResponse team2 = new TeamResponse(playAgainst.getId(), playAgainst.getTeam2().getName(),playAgainst.getTeam2().getSponsorEntity(),playAgainst.getTeam2().getPlayerEntity().stream().map(PlayerMatchMapper::toRest).toList());
       List<Score>  scorer_home = new ArrayList<>();
       List<Score>  scorer_away = new ArrayList<>();
       int score_a = 0;
       int score_b = 0;

        for(int i=0;i<playAgainst.getScore().size()-1;i++) {

            if (playAgainst.getScore().get(i).getPlayer().getTeam() == playAgainst.getScore().get(i + 1).getPlayer().getTeam()) {
                if (!playAgainst.getScore().get(i).getPlayer().getPost().contains("GK")) {
                    scorer_home.add(playAgainst.getScore().get(i));
                    score_a += 1;
                }

            } else {
                if (!playAgainst.getScore().get(i+1).getPlayer().getPost().contains("GK")) {
                    scorer_away.add(playAgainst.getScore().get(i+1));
                    score_b += 1;
                }
            }
        }
        return PlayResponse.builder()
                .id(playAgainst.getId())
                .datetime(playingTime)
                .Home(team1)
                .Away(team2)
                .team_a_score(score_a)
                .team_b_score(score_b)
                .scorer_home(scorer_home.stream().map(ScoreMapper::toRest).toList())
                .scorer_away(scorer_away.stream().map(ScoreMapper::toRest).toList())
                .build();
    }
}
