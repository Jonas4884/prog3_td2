package com.prog3_td2.prog3.controllers.response;

import com.prog3_td2.prog3.model.TeamEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class PlayResponse {
    private Long id;
    private  String datetime;
    private String team1;
    private String team2;
}