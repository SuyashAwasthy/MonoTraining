package com.techlabs.dip;

import com.techlabs.dip.solution.DBLogger;
import com.techlabs.dip.solution.FileLogger;
import com.techlabs.dip.solution.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		
		TaxCalculator t1 = new TaxCalculator(new DBLogger());
		System.out.println(t1.calculateTax(100,10));
		
		TaxCalculator t2 = new TaxCalculator(new FileLogger());
		System.out.println(t2.calculateTax(2000,0));

	}

}
