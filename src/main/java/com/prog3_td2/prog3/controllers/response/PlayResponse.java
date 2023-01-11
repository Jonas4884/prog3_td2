package com.prog3_td2.prog3.controllers.response;


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
    private TeamResponse Home;
    private TeamResponse Away;
}
