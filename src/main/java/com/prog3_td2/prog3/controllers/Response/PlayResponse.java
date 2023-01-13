package com.prog3_td2.prog3.controllers.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class PlayResponse {
    private Long id;
    private  String datetime;
    private int team_a_score;
    private int team_b_score;
    private TeamResponse Home;
    private TeamResponse Away;

    private List<ScoreResponse> scorer_home;

    private List<ScoreResponse> scorer_away;
}
