package com.techlabs.dip.violation;

public class TaxCalculator implements DBLogger{

	DBLogger dblogger;
	
	public TaxCalculator(DBLogger dblogger) {
		super();
		this.dblogger = dblogger;
	}

	@Override
	public void log(String err) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void log(String err) {
//		
//		System.out.println("Logged to database");
//		
//	}
//	
//	int calculateTax(int amount, int rate) {
//		int tax = 0;
//		try {
//			tax=amount/rate;
//		}
//		catch(Exception e) {
//			new DBLogger().log("Divide by zero");
//		}
//		return amount*rate/100;
	}

