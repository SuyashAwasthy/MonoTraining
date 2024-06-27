package com.techlabs.srp.solution;

public class Invoice {

	protected int id;
	protected String description;
	protected double amount;
	protected double tax;
	
	public Invoice(int id, String description, double amount, double tax) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getTax() {
		return amount*tax/100;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
