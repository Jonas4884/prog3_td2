package com.prog3_td2.prog3.controllers.Mapper;

import com.prog3_td2.prog3.model.PlayerEntity;
import com.prog3_td2.prog3.model.SponsorEntity;
import com.prog3_td2.prog3.model.TeamEntity;

public class SponsorisedMapper {

    public static String toTeamName(TeamEntity team){
        return  team.getName();
    }


}
