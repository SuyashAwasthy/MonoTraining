package com.techlabs.assignments;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
		int arraySize = scanner.nextInt();
		if (arraySize < 2) {
            System.out.print("Second largest element does not exist.");
        }
		else {
			int[] array = new int[arraySize];
			System.out.println("Enter the elements of the array: ");
			for (int i = 0; i < arraySize; i++) {
				array[i] = scanner.nextInt();	
			}
			int largest, secondLargest;
			largest = secondLargest = array[0]; //check
			for (int i = 0; i < arraySize; i++) {
				if (array[i] > largest) {
					secondLargest = largest;
					largest = array[i];
				}
				else if (array[i] > secondLargest && array[i] != largest) {
					secondLargest = array[i];
				}
			}
			if (secondLargest == array[0]) //check
				System.out.print("Second largest element does not exist.");
			else
				System.out.print("Second largest element is " + secondLargest);
		}
		scanner.close();
	}

}
