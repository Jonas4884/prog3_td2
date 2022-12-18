package com.prog3_td2.prog3.controllers;

import com.prog3_td2.prog3.model.TeamEntity;
import com.prog3_td2.prog3.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;

    @GetMapping("/match")
    public List<?> getAllEntities(){
        return service.getAllteam();
    }
}
