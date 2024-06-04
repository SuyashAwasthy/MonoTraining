package com.techlabs.model;

public class SavingAccount extends Account{

	private double minimumBalance;

	public SavingAccount(int accountNumber, String name, double balance, double minimumBalance) {
		//super(accountNumber, name, balance);
		this.minimumBalance = minimumBalance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	
}
