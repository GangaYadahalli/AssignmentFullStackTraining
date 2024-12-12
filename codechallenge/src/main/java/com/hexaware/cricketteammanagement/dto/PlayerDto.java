package com.hexaware.cricketteammanagement.dto;




public class PlayerDto {
	
	private Integer playerId;
	private String playerName;
	private Integer jerseyNumber;
	private String role;
	private Integer totalMatches;
	private String teamName;
	private String country;
	private String description;
	
//	public enum Role {
//		BATSMAN, BOWLER , KEEPER, ALLROUNDER
//	}

	public PlayerDto() {
		super();
	}



	
	public PlayerDto(Integer playerId, String playerName, Integer jerseyNumber, String role, Integer totalMatches,
			String teamName, String country, String description) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
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



//
//	public String getRoles() {
//		return role;
//	}
//
//
//
//
//	public void setRoles(String roles) {
//		this.role = role;
//	}




	public String getRole() {
		return role;
	}




	public void setRole(String role) {
		this.role = role;
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
				+ ", role=" + role + ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", country="
				+ country + ", description=" + description + "]";
	}








}




