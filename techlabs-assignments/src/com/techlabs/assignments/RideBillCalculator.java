package com.techlabs.assignments;

import java.util.Scanner;

public class RideBillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Is your height greater than 120cm? ");
		String ans1 = scanner.nextLine();
		int bill = 0;
		if(ans1.equals("No")) System.out.println("Can't ride.");
		else {
			System.out.println("Can ride.");
			System.out.println("Enter your age: ");
			int age = scanner.nextInt();
			if(age<12) {
				bill+=5;
			}
			else if(age>=12 && age<=18) {
				bill+=7;
			}
			else {
				if(age<45 || age>55)
					bill+=12;
			}
			System.out.println("Do you want photos? ");
			String ans2 = scanner.next();
			if(ans2.equals("Yes")) bill+=3;
			System.out.println("Your total bill is: $"+bill);
		}
		scanner.close();
	}

}
