package com.prog3_td2.prog3.controllers.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class ScoreResponse {
    private Long id;

    private PlayMatchResponse scorer;

    private String scoringTime;
}