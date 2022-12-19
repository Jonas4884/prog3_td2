package com.prog3_td2.prog3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
@Table(name = "player")
public class PlayerEntity {
    @Id
    private Long id;
    private String name;
    private int number;

    @OneToOne
    @JoinColumn(name = "team_entity_id")
    private TeamEntity team;
}
