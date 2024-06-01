package com.techlabs.assignments;

import java.util.Scanner;

public class NumberGuesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int tries = 7, guess, i; //tries=5 were too less and tries=10 were too high, so took tries=7
        System.out.println("A number is chosen between 1 to 100. Guess the number within 7 trials.");
        for (i = 0; i < tries; i++) {
            System.out.println("Guess the number:");
            guess = scanner.nextInt();
            if (number == guess) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            }
            else if (number > guess && i != tries - 1)
                System.out.println("The number is greater than " + guess);
            else if (number < guess && i != tries - 1) 
                System.out.println("The number is less than " + guess);
        }
        if (i == tries) {
            System.out.println("You have exhausted 7 trials.");
            System.out.println("The number was " + number);
        }
        scanner.close();
	}

}
