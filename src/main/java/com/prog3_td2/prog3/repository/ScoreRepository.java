package com.prog3_td2.prog3.repository;

import com.prog3_td2.prog3.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score,Long> {
}
