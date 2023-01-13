package com.prog3_td2.prog3.model;

import com.google.type.DateTime;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Score {

    @Id
    public Long id;

    @ManyToOne
    public PlayerEntity player;
    @OneToOne
    public GoalEntity goal;

    @Transient
    private int team_1_score;
    @Transient
    private int team_2_score;
    @Column(name = "scoring_time")
    public LocalDateTime scoringTime;
}
