package com.prog3_td2.prog3.repository;

import com.prog3_td2.prog3.model.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamRepository extends JpaRepository<TeamEntity,Long> {

    @Query(value="select t from play_against p inner join team t on t.team_1_id=p.id",nativeQuery = true)
    List<TeamEntity> getallMatch() ;
}
