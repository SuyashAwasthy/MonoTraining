package com.techlabs.first;

import java.util.Scanner;

public class GradeSwitches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a grade: ");
		char grade = scanner.next().charAt(0);
		switch(grade) {
		case 'A' : System.out.println("Excellent"); break;
		case 'B' : System.out.println("Good"); break;
		case 'C' : System.out.println("OK"); break;
		case 'D' : System.out.println("Failed"); break;
		default: System.out.println("Enter a valid grade");
		}
		scanner.close();
	}

}
