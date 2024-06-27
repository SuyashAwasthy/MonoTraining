package com.techlabs.srp;

import com.techlabs.srp.solution.InvoicePrinter;
import com.techlabs.srp.solution.TaxCalculator;

public class InvoiceTest {

	public static void main(String[] args) {
		
		InvoicePrinter invoice = new InvoicePrinter(1, "invoice1", 1000, 10);
		TaxCalculator taxCalculator = new TaxCalculator(1, "invoice1", 1000, 10);
		invoice.printInvoice();
		taxCalculator.calculateTax();

	}

}
