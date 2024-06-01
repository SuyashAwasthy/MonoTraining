package com.techlabs.first;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = scanner.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(num+"*"+i+" = "+num*i);
			i++;
		}
		scanner.close();
	}

}
