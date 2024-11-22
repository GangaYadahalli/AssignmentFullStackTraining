package com.hexaware.cricketteammanagement.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.cricketteammanagement.dto.PlayerDto;
import com.hexaware.cricketteammanagement.entity.Player;
import com.hexaware.cricketteammanagement.exception.PlayerNotFoundException;
import com.hexaware.cricketteammanagement.service.IPlayerService;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
	
	@Autowired
	IPlayerService service;
	
	Logger logger=LoggerFactory.getLogger(PlayerController.class);
	
	@PostMapping("/insert")
	 public  Player  insert(@RequestBody PlayerDto playerDto) 
	{
		logger.info("Player added successfully");
		return  service.addPlayer(playerDto);
		
	}
	
	@PutMapping("/update/{playerId}")
	public Player update(@RequestBody PlayerDto playerDto ,@PathVariable Integer playerId)
	{
		logger.info("Player updated successfully");
		return service.updatePlayer(playerDto);
	}
	
	@GetMapping("/getById/{playerId}")
	public Player  getById(@PathVariable Integer playerId) 
	{
	Player player=null;
	player=service.getPlayerById(playerId);
	if(player!=null)
	{
		return player;
	}
	else {
		logger.warn("Player not Found");
		throw new PlayerNotFoundException();
	}
	}
	@GetMapping("/getAll")
	public List<Player> getAll()
	{
		return service.getAllPlayer();
		
	}
	
	@DeleteMapping("/deleteById/{playerId}")
	public String deleteById(@PathVariable Integer playerId)
	{
	 service.deletePlayerById(playerId);
	 
	 return "Record of player deleted"+playerId;
	}
	

}


