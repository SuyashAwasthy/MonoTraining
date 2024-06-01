package com.techlabs.assignments;

import java.util.Scanner;

public class WaterBillApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no. of units consumed: ");
		int units = scan.nextInt();
		int meter_charge=75;
		int charge, total_bill;
		if(units<=100) {
			charge=units*5;
			total_bill=charge+meter_charge;
			System.out.println("Total water bill = "+total_bill);
		}
		else {
			if(units<=250)
				charge=units*10;
			else charge=units*20;
			total_bill=charge+meter_charge;
			System.out.println("Total water bill = "+total_bill);
		}
		scan.close();
	}

}
