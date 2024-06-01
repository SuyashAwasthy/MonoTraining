package com.techlabs.arrays;

import java.util.Scanner;

public class PeakElements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        
        if(arraySize < 2) System.out.println("No peak element possible.");
        
        else {
        	
        	int[] arr = new int[arraySize];
        	System.out.println("Enter the elements of the array: ");
        	
        	for (int i = 0; i < arraySize; i++) 
        		arr[i] = scanner.nextInt();
        		
        	for(int i = 0 ;i < arraySize; i++) {
        		if(i==0 && arr[i]>=arr[i+1])
        			System.out.println(arr[i]+" ");
        		
        		if(i>0 && i<arraySize-1 && (arr[i]>=arr[i-1]) && (arr[i]>=arr[i+1]))
    				System.out.println(arr[i]+" ");
        		
        		if(i==arraySize-1 && arr[i]>=arr[i-1])
        			System.out.println(arr[i]);
        	}
        }
        scanner.close();
	}

}
