package com.prog3_td2.prog3.controllers.Response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SponsorResponse {
    private Long id;
    private String name;
    private List<String> sponsorised;
}

