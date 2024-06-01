package com.techlabs.scanner;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scanner.nextInt();
		float divi = (float)num1/num2;
		System.out.println(num1+"/"+num2+" = "+divi);
		scanner.close();
	}

}
