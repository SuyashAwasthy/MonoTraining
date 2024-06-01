package com.techlabs.arrays;

import java.util.Scanner;

public class MaximumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] arr = new int[arraySize];
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < arraySize; i++)
        	arr[i] = scanner.nextInt();
        System.out.println("Maximum element of the array is: ");
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arraySize; i++)
        	if(arr[i]>maxi)
        		maxi = arr[i];
        System.out.println(maxi);
        scanner.close();
	}

}
