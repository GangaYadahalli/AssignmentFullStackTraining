package com.hexaware.cricketteammanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(PlayerNotFoundException.class)
	public ResponseEntity<String> handlePlayerNotFoundException() {
	    return new ResponseEntity<>("Invalid input please enter valid playerId  ",HttpStatus.BAD_REQUEST);
	}

}
