package com.techlabs.first;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any single digit number: ");
		int num = scanner.nextInt();
		System.out.print("Factorial of "+num+" = ");
		int ans = 1, i=1;
		while(i<=num) {
			ans *= (i);
			i+=1;
		}
		System.out.print(ans);
		scanner.close();
	}
}
