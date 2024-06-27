package com.techlabs.test;

import com.techlabs.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(1, "invoice1", 1000, 10);

		invoice.printInvoice();
//		invoice.setId(2);
//		invoice.setDescription("invoice2");
//		invoice.setAmount(2000);
//		invoice.setTax(20);
		
//		System.out.println(invoice.getId());
//		System.out.println(invoice.getDescription());
//		System.out.println(invoice.getAmount());
//		System.out.println(invoice.getTax());
		
	}

}

