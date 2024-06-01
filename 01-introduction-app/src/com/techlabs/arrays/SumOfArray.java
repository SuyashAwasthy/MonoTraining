package com.techlabs.arrays;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] arr = new int[arraySize];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arraySize; i++)
        	arr[i] = scanner.nextInt();
        System.out.println("Sum of the array elements is: ");
        int sum = 0;
        for (int i = 0; i < arraySize; i++)
        	sum += arr[i];
        System.out.println(sum);
        scanner.close();

	}

}
