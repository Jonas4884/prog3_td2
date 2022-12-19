package com.prog3_td2.prog3.repository;

import com.prog3_td2.prog3.model.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamRepository extends JpaRepository<TeamEntity,Long> {
    TeamEntity findByName(String name);
}
