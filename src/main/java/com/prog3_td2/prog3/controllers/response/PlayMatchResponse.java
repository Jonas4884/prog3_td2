package com.prog3_td2.prog3.controllers.response;

import com.prog3_td2.prog3.model.PlayerEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class PlayMatchResponse {
    private Long id;
    private String name;
    private String post;
    private String team;
}
