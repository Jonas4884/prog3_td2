package com.prog3_td2.prog3.repository;

import com.prog3_td2.prog3.model.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamRepository extends JpaRepository<TeamEntity,Long> {

//    @Query(value="select t from team p inner join play_against t on p.id=t.team_1_id",nativeQuery = true)
//    List<TeamEntity> getallMatch1() ;
//    @Query(value="select t from team p inner join play_against t on p.id=t.team_2_id",nativeQuery = true)
//    List<TeamEntity> getallMatch2() ;
}
