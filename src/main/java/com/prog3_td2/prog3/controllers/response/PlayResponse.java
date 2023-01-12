package com.prog3_td2.prog3.controllers.response;

import com.prog3_td2.prog3.model.Score;
import com.prog3_td2.prog3.model.TeamEntity;
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
    private TeamResponse Home;
    private TeamResponse Away;

    private List<ScoreResponse> score;
}
