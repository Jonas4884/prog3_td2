package com.prog3_td2.prog3.controllers.response;

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
    private List<String> sponsors;
    private List<String> Player;
}
