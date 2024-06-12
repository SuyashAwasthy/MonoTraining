package com.techlabs.exceptions;

public class InsufficientFundsException extends Exception{

	public String getMessage() {
		return "Insufficient funds.";
	}

}
