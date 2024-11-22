package com.hexaware.cricketteammanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cricketteammanagement.dto.PlayerDto;
import com.hexaware.cricketteammanagement.entity.Player;
import com.hexaware.cricketteammanagement.repository.PlayerRepository;

import jakarta.transaction.Transactional;
@Transactional
@Service
public class PlayerServiceImp implements IPlayerService{
	
	@Autowired
	PlayerRepository repo;

	@Override
	public Player addPlayer(PlayerDto playerDto) {
		
		Player player = new Player();
		player.setPlayerId(playerDto.getPlayerId());
		player.setPlayerName(playerDto.getPlayerName());
		player.setJerseyNumber(playerDto.getJerseyNumber());
		player.setRoles(Player.Role.valueOf(playerDto.getRoles().name()));
		player.setTotalMatches(playerDto.getTotalMatches());
		player.setTeamName(playerDto.getTeamName());
		player.setCountry(playerDto.getCountry());
		player.setDescription(playerDto.getDescription());

		return repo.save(player);
	}

	@Override
	public Player updatePlayer(PlayerDto playerDto) {

		
		Player player = new Player();
		player.setPlayerId(playerDto.getPlayerId());
		player.setPlayerName(playerDto.getPlayerName());
		player.setJerseyNumber(playerDto.getJerseyNumber());
		player.setRoles(Player.Role.valueOf(playerDto.getRoles().name()));
		player.setTotalMatches(playerDto.getTotalMatches());
		player.setTeamName(playerDto.getTeamName());
		player.setCountry(playerDto.getCountry());
		player.setDescription(playerDto.getDescription());

		return repo.save(player);
	
	}

	@Override
	public Player getPlayerById(Integer playerId) {
		
		return repo.findById(playerId).orElse(null);
	}

	@Override
	public void deletePlayerById(Integer playerId) {
		repo.deleteById(playerId);
		
		
	}

	@Override
	public List<Player> getAllPlayer() {
		
		return repo.findAll();
	}

	@Override
	public List<Player> findByTeamName(String teamName) {
		
		return repo.findByTeamName(teamName);
	}




}
