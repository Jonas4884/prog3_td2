package com.prog3_td2.prog3.Mapper;

import com.prog3_td2.prog3.controllers.response.SponsorResponse;
import com.prog3_td2.prog3.model.SponsorEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
public class SponsorMapper {
    public static SponsorResponse toRest(SponsorEntity sponsorEntity){
        return SponsorResponse.builder()
                .id(sponsorEntity.getId())
                .name(sponsorEntity.getName())
                .sponsorised(sponsorEntity.getTeamEntity().stream().map(SponsorisedMapper::toTeamName).toList())
                .build();
    }
}
