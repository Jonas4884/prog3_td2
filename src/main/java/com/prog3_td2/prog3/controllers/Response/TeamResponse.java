package com.prog3_td2.prog3.controllers.Response;

import com.prog3_td2.prog3.model.SponsorEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class TeamResponse {
    private Long id;
    private String name;
    private List<SponsorEntity> sponsors;
    private List<PlayMatchResponse> Player;
}
