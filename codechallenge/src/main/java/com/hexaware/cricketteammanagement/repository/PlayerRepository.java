package com.hexaware.cricketteammanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.cricketteammanagement.entity.Player;


@Repository
public interface PlayerRepository  extends JpaRepository<Player ,Integer>{ 


	@Query("select p from Player p where p.teamName=:teamName")
	public List<Player> findByTeamName(String teamName);
	



}
