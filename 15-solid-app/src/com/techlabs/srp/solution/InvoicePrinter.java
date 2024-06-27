package com.techlabs.srp.solution;

public class InvoicePrinter extends Invoice{

	public InvoicePrinter(int id, String description, double amount, double tax) {
		super(id, description, amount, tax);
	}

	public void printInvoice() {
		System.out.println("ID: "+id);
		System.out.println("Description: "+description);
		System.out.println("Amount: "+amount);
		System.out.println("Tax: "+(amount*tax/100));
	}
	
}
