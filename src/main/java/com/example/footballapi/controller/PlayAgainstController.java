package com.example.footballapi.controller;

import com.example.footballapi.controller.mapper.PlayMatchMapper;
import com.example.footballapi.controller.model.PlayResponse;
import com.example.footballapi.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayAgainstController {
    private final MatchService service;
    private final PlayMatchMapper mapper;

    @GetMapping("/matches")
    public List<PlayResponse> getAllMatch() {
        return service.getAllMatch().stream().map(mapper::toRest).toList();
    }
}
