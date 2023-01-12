package com.prog3_td2.prog3.model;

import com.google.type.DateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
    public LocalDateTime scoringTime;
}
