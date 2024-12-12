package com.hexaware.cricketteammanagement.restcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/players")
public class PlayerController {
	
	@Autowired
	IPlayerService service;
	
	Logger logger=LoggerFactory.getLogger(PlayerController.class);
	
//	@PostMapping("/insert")
//	 public  Player  insert(@RequestBody PlayerDto playerDto) 
//	{
//		logger.info("Player added successfully");
//		return  service.addPlayer(playerDto);
//		
//	}
	@PostMapping("/insert")
	public ResponseEntity<?> addPlayer(@RequestBody PlayerDto playerDto) {
	    System.out.println("Incoming Player Data: " + playerDto);
	    
	    // Assuming you have a service that saves the player
	    Player player = service.addPlayer(playerDto); // service logic
	    
	    // Return the response with a success message
	    Map<String, String> response = new HashMap<>();
	    response.put("message", "Player added successfully");

	    return ResponseEntity.status(HttpStatus.CREATED).body(response);
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
	
	@GetMapping("/getByTeamName/{teamName}")
	public List<Player> getByTeamName(@PathVariable String teamName)
	{
		return service.findByTeamName(teamName);
		
	}
	

}


