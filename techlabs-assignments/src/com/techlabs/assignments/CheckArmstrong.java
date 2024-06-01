package com.techlabs.assignments;

import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = scanner.nextInt();
		int copy = num;
		int order = 0;
        while (copy != 0) {
            order++;
            copy = copy / 10;
        }
        int temp = num, sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, order);
            temp = temp / 10;
        }
 
        if(sum == num) System.out.println(num+" is an armstrong number.");
        else System.out.println(num+" is not an armstrong number");
		scanner.close();
	}

}
