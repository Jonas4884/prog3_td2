package com.prog3_td2.prog3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
@Table(name = "team")
public class TeamEntity {
    @Id
    private Long id;
    private String name;

    @OneToMany(mappedBy = "id")
    private List<PlayerEntity> playerEntity;

    @OneToOne
    @JoinColumn(name = "id", foreignKey = @ForeignKey(name = "fk_team1"))
    private TeamEntity teamEntity;
}
