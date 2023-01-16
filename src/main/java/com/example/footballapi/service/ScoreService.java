package com.example.footballapi.service;

import com.example.footballapi.model.ScoreEntity;
import com.example.footballapi.repository.ScoreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ScoreService {
    private final ScoreRepository repository;

    public List<ScoreEntity> getScorersByTeamId(long goalId, long teamId) {
        return this.getScorersById(goalId).stream().filter(
                scorer -> {
                    var teamAwayId = scorer.getPlayer().getTeam().getId();

                    if (teamAwayId == teamId) {
                        return !scorer.isOG();
                    }
                    return scorer.isOG();
                }

        ).toList();
    }

    public List<ScoreEntity> getScorersById(long goalId) {
        return repository.findAllByGoalId(goalId);
    }
}
