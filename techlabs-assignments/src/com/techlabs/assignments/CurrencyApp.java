package com.techlabs.assignments;

import java.util.Scanner;

public class CurrencyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount in multiple of 100s (less than 50000): ");
		int amount = scanner.nextInt();
		int[] notes = new int[]{2000, 500, 200, 100};
        int[] count = new int[4];
        for (int i=0; i<4; i++) {
            if (amount >= notes[i]) {
                count[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }
        System.out.println("Currency Count ->");
        for (int i=0; i<4; i++)
            if (count[i] != 0)
                System.out.println(notes[i] + " : " + count[i]);
        scanner.close();
	}

}
