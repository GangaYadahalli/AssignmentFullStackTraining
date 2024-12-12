package com.hexaware.cricketteammanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer playerId;
	
	@Pattern(regexp="^[a-zA-Z]{2,50}$", message="Name should only contain letters and be 2 to 50 characters")
	private String playerName;
	
	@NotNull
	private Integer jerseyNumber;
	
	@Enumerated(EnumType.STRING)
	private Role roles;
	
	@NotNull
	private Integer totalMatches;
	
	@Pattern(regexp="^[a-zA-Z]{2,50}$", message="Team Name should only contain letters and be 2 to 50 characters")
	private String teamName;
	
	@Pattern(regexp="^[a-zA-Z]{2,50}$", message="Country Name should only contain letters and be 2 to 50 characters")
	private String country;
	
	 @NotBlank(message = "Description is required")
	private String description;
	
	public enum Role {
		
		BATSMAN, BOWLER , KEEPER, ALLROUNDER
	}

	public Player() {
		super();
	}
	
	public Player(Integer playerId,
			@Pattern(regexp = "^[a-zA-Z]{2,50}$", message = "Name should only contain letters and be 2 to 50 characters long") String playerName,
			@NotNull Integer jerseyNumber, Role roles, @NotNull Integer totalMatches,
			@Pattern(regexp = "^[a-zA-Z]{2,50}$", message = "Team Name should only contain letters and be 2 to 50 characters long") String teamName,
			@Pattern(regexp = "^[a-zA-Z]{2,50}$", message = "Country Name should only contain letters and be 2 to 50 characters long") String country,
			@NotBlank(message = "Description is required") String description) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.roles = roles;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.country = country;
		this.description = description;
	}




	public Integer getPlayerId() {
		return playerId;
	}




	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}




	public String getPlayerName() {
		return playerName;
	}




	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Integer getJerseyNumber() {
		return jerseyNumber;
	}




	public void setJerseyNumber(Integer jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}




	public Role getRoles() {
		return roles;
	}




	public void setRoles(Role roles) {
		this.roles = roles;
	}




	public Integer getTotalMatches() {
		return totalMatches;
	}




	public void setTotalMatches(Integer totalMatches) {
		this.totalMatches = totalMatches;
	}




	public String getTeamName() {
		return teamName;
	}




	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}




	public String getCountry() {
		return country;
	}




	public void setCountry(String country) {
		this.country = country;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber
				+ ", roles=" + roles + ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", country="
				+ country + ", description=" + description + "]";
	}



}
