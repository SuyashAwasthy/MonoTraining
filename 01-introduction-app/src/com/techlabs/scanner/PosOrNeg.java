package com.techlabs.scanner;

import java.util.Scanner;

public class PosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		if(num>0)
			System.out.println("Number is positive");
		else if(num<0)
			System.out.println("Number is negative");
		else 
			System.out.println("Number is zero");
		scanner.close();
	}

}
