package com.techlabs.exceptions;

public class AgeNotValidException extends RuntimeException{

	public String getMessage() {
	    return "Age is not valid to vote.";
	}
	
}
