package com.prog3_td2.prog3.controllers;

import com.prog3_td2.prog3.Mapper.SponsorMapper;
import com.prog3_td2.prog3.controllers.response.SponsorResponse;
import com.prog3_td2.prog3.model.SponsorEntity;
import com.prog3_td2.prog3.repository.SponsorRepository;
import com.prog3_td2.prog3.service.SponsorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@AllArgsConstructor
public class SponsorController {
    private final SponsorService service;
    @GetMapping("/sponsor")
    public List<SponsorResponse> getAllSponsor(){
        return service.getAllsponsor().stream().map(SponsorMapper::toRest).toList();
    }
}
