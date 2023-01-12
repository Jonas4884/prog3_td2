package com.prog3_td2.prog3.controllers.Mapper;

import com.prog3_td2.prog3.controllers.response.PlayMatchResponse;
import com.prog3_td2.prog3.model.PlayerEntity;
import org.springframework.stereotype.Component;

@Component
public class PlayerMatchMapper {
    public static PlayMatchResponse toRest(PlayerEntity player){
        return PlayMatchResponse.builder()
                .id(player.getId())
                .name(player.getName())
                .post(player.getPost())
                .build();
    }
}
