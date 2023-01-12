package com.prog3_td2.prog3.controllers.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class ScoreResponse {
    private Long id;
    private PlayMatchResponse scorer;

    private String scoringTime;
}
