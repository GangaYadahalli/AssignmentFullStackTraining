package com.hexaware.cricketteammanagement.dto;

import com.hexaware.cricketteammanagement.entity.Player.Role;


public class PlayerDto {
	
	private Integer playerId;
	private String playerName;
	private Integer jerseyNumber;
	private Role roles;
	private Integer totalMatches;
	private String teamName;
	private String country;
	private String description;
	public enum Role {
		BATSMAN, BOWLER , KEEPER, ALLROUNDER
	}

	public PlayerDto() {
		super();
	}



	
	public PlayerDto(Integer playerId, String playerName, Integer jerseyNumber, Role roles, Integer totalMatches,
			String teamName, String country, String description) {
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
		return "PlayerDto [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber
				+ ", roles=" + roles + ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", country="
				+ country + ", description=" + description + "]";
	}



}




