package com.prog3_td2.prog3.controllers;

import com.prog3_td2.prog3.model.Score;
import com.prog3_td2.prog3.service.ScoreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ScoreController {
    private final ScoreService service;


    @GetMapping("/score")
    public List<Score> getAllScore(){
        return service.getAllSCore();
    }
}
