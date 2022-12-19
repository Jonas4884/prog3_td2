package com.prog3_td2.prog3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @ManyToMany
    @JoinTable(
            name = "have",
            joinColumns = @JoinColumn(name = "team_id"),
            inverseJoinColumns = @JoinColumn(name = "sponsor_id")
    )
    private List<SponsorEntity> sponsorEntity;

    @OneToMany(mappedBy = "team")
    @OrderBy("number")
    private List<PlayerEntity> PlayerEntity;
}
