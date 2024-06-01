package com.techlabs.model;

public class Account {

	private static int accountCount;
	private int accountNumber;
	private String name;
	private double balance;
	

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		accountCount++;;
	}

	public void display() {
		System.out.println("Account count: "+accountCount);
		System.out.println("Account number: "+accountNumber);
		System.out.println("Name: "+name);
		System.out.println("Balance: "+balance);
		System.out.println();
	}
	
	
	
}
