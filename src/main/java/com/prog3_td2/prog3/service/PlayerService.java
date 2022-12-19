package com.prog3_td2.prog3.service;

import com.prog3_td2.prog3.model.PlayerEntity;
import com.prog3_td2.prog3.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {
    private  final PlayerRepository repository;

    public List<PlayerEntity> playerEntityList(){
        return  repository.findAll(Sort.by("number").ascending());
    }
}
