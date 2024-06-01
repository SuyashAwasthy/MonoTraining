package com.techlabs.assignments;

import java.util.Scanner;

public class CheckPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = scanner.nextInt();
		int sum = 1;
        for (int i=2;i<num;i++)
            if (num % i == 0)
                sum += i;
        if (sum == num)
            System.out.println(num+" is a perfect number.");
        else System.out.println(num+" is not a perfect number.");
        scanner.close();
	}
}
