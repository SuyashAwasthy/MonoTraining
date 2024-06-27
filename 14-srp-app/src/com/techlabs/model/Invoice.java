package com.techlabs.model;

public class Invoice {

	private int id;
	private String description;
	private double amount;
	private double tax;
	
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
	
	public void printInvoice() {
		System.out.println(id);
		System.out.println(description);
		System.out.println(amount);
		System.out.println(amount*tax/100);
	}
	
}
