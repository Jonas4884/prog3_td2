package com.prog3_td2.prog3.repository;

import com.prog3_td2.prog3.model.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamEntity,Long> {
}
