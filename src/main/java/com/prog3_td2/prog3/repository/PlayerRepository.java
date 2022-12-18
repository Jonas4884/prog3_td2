package com.prog3_td2.prog3.repository;

import com.prog3_td2.prog3.model.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity,Long> {
}
