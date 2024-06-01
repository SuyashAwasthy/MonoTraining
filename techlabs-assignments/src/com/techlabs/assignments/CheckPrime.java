package com.techlabs.assignments;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = scanner.nextInt();
		boolean flag = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
            	flag=false;
            	break;
            }
		}
		if(flag==true) System.out.println(num+" is prime.");
		else System.out.println(num+" is not prime.");
		scanner.close();
	}

}
