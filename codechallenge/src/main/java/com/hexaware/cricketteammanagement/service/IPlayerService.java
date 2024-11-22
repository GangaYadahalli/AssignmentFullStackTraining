package com.hexaware.cricketteammanagement.service;

import java.util.List;

import com.hexaware.cricketteammanagement.dto.PlayerDto;
import com.hexaware.cricketteammanagement.entity.Player;



public interface IPlayerService {
	
	public Player  addPlayer(PlayerDto playerDto);
	
	public Player updatePlayer(PlayerDto playerDto);
	
 	public Player getPlayerById(Integer playerId);
	
	public void deletePlayerById(Integer playerId);
	
	public List<Player> getAllPlayer();
	
	
	

}
