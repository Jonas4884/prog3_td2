package com.example.footballapi.controller.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
public class PlayResponse {
    private long id;
    private LocalDateTime datetime;

    private PlayedTeamResponse teamHome;
    private PlayedTeamResponse teamAway;
}
