package com.techlabs.scanner;

import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scanner.nextInt();
		int diff = num1-num2;
		System.out.println(num1+"-"+num2+" = "+diff);
		scanner.close();
	}

}
