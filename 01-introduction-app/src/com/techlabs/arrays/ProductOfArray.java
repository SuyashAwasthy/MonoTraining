package com.techlabs.arrays;

import java.util.Scanner;

public class ProductOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
		 	int arraySize = scanner.nextInt();
		 	if (arraySize == 1) { 
	            System.out.print("0"); 
	        } 
		 	else {
		 		int[] arr = new int[arraySize];
		 		System.out.println("Enter the elements of the array: ");
		 		for (int i = 0; i < arraySize; i++) {
		 			arr[i] = scanner.nextInt();	
		 		}
		 		int prod[] = new int[arraySize]; 
		 		for (int i = 0; i < arraySize; i++) {
		 			prod[i] = 1; 
		 		}
		 		int temp = 1;
		 		for (int i = 0; i < arraySize; i++) { 
		 			prod[i] = temp; 
		 			temp *= arr[i]; 
		 		}	 
		 		temp=1;
		 		for (int i = arraySize - 1; i >= 0; i--) { 
		 			prod[i] *= temp; 
		 			temp *= arr[i]; 
		 		} 
		 		for (int i = 0; i < arraySize; i++) 
		 			System.out.print(prod[i] + " "); 
		 	}
	   scanner.close();
	}

}
