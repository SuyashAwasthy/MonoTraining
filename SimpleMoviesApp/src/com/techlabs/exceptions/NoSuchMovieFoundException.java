package com.techlabs.exceptions;

public class NoSuchMovieFoundException extends RuntimeException{

	public String getMessage() {
		return "No such movie found. Try again!";
	}
	
}
