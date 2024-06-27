package com.techlabs.srp.solution;

public class TaxCalculator extends Invoice{

	public TaxCalculator(int id, String description, double amount, double tax) {
		super(id, description, amount, tax);
	}

	public void calculateTax() {
		System.out.println("Tax: "+(amount*tax/100));
	}
	
}
