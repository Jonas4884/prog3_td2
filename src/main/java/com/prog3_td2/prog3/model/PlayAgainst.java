package com.prog3_td2.prog3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class PlayAgainst {
    @Id
    private Long id;
    @Column(name = "datetime")
    private LocalDateTime dateTime;
    private String stadium;

    @OneToOne
    @JoinColumn(name = "team_1_id",foreignKey = @ForeignKey(name = "fk_team1"))
    private TeamEntity team1;

    @OneToOne
    @JoinColumn(name = "team_2_id",foreignKey = @ForeignKey(name = "fk_team2"))
    private TeamEntity team2;

    @OneToOne
    private Score score;
}
