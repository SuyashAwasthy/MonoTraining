package com.techlabs.exceptions;

public class CapacityFullException extends RuntimeException{

	public String getMessage() {
		return "Capacity is full. You cannot add more movies now.";
	}
	
}
