package com.techlabs.scanner;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		if(num%2==0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
		scanner.close();
	}

}
