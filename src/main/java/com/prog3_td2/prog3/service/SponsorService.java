package com.prog3_td2.prog3.service;

import com.prog3_td2.prog3.model.SponsorEntity;
import com.prog3_td2.prog3.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class SponsorService {
    private final SponsorRepository repository;
    public List<SponsorEntity> getAllsponsor(){
        return repository.findAll();
    }
}
