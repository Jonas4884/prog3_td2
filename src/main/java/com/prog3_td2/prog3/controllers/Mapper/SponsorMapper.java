package com.prog3_td2.prog3.controllers.Mapper;

import com.prog3_td2.prog3.controllers.response.SponsorResponse;
import com.prog3_td2.prog3.model.SponsorEntity;
import lombok.Builder;

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
