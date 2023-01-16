package com.example.footballapi.repository;

import com.example.footballapi.model.PlayAgainst;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<PlayAgainst, String> {
}
