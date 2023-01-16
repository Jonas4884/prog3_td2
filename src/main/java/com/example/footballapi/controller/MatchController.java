package com.example.footballapi.controller;

import com.example.footballapi.controller.mapper.PlayMatchMapper;
import com.example.footballapi.controller.model.PlayResponse;
import com.example.footballapi.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("matches")
public class MatchController {
    private final MatchService service;
    private final PlayMatchMapper mapper;

    @GetMapping
    public List<PlayResponse> getAll() {
        return service.getAllMatch().stream().map(mapper::toRest).toList();
    }
}
