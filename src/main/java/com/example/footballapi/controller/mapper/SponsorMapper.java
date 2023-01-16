package com.example.footballapi.controller.mapper;

import com.example.footballapi.controller.model.SponsorResponse;
import com.example.footballapi.model.SponsorEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SponsorMapper {
    SponsorResponse toRest(SponsorEntity sponsorEntity) {
        return SponsorResponse.builder()
                .id(sponsorEntity.getId())
                .name(sponsorEntity.getName())
                .build();
    }
}
