package com.prog3_td2.prog3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @ManyToOne
    @JoinColumn(name = "team_entity_id",foreignKey = @ForeignKey(name = "fk_team"))
    @JsonIgnore
    private TeamEntity team;
}
