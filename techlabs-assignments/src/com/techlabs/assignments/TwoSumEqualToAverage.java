package com.techlabs.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumEqualToAverage {

	static double target;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        
        int[] array = new int[arraySize];
        System.out.println("Enter the elements of the array: ");
        
        for (int i = 0; i < arraySize; i++)
        	array[i] = scanner.nextInt();
        
        if(isSumEqualAverage(array, arraySize))
        	System.out.println("True, " + target + " is equal to sum of a pair in the array!");
        else 
        	System.out.println("False, " + target + " is NOT equal to sum of any pair in the array!");

        scanner.close();
	}
	
	private static boolean isSumEqualAverage(int[] array, int arraySize){
        int sum = 0;
        for (int i = 0; i < arraySize; i++)
        	sum += array[i];
        
        double average = sum / arraySize;
        target = average;
        System.out.println("Average of array elements = " + average);
        int checkDecimal = (int)average;
        if(checkDecimal*checkDecimal == average*average) {
        	Map<Integer, Integer> numToIndex = new HashMap<>();
            for (int i = 0; i < array.length; i++) {
                if (numToIndex.containsKey(checkDecimal - array[i])) {
                    return true;
                }
                numToIndex.put(array[i], i);
            }
        }
        return false;
	}

}
