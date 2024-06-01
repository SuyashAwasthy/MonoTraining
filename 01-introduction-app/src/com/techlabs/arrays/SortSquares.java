package com.techlabs.arrays;

import java.util.Scanner;

public class SortSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] arr = new int[arraySize];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arraySize; i++)
        	arr[i] = scanner.nextInt();							// -5,-4,0,3,7
        int left = 0, right = arraySize - 1;
        int sorted[] = new int[arraySize];
        for(int i = arraySize - 1; i >= 0; i--){
        	if (Math.abs(arr[left]) > arr[right]){				// , , 16, 25,
        		sorted[i] = arr[left] * arr[left];
                left++;
            }
            else{
                sorted[i] = arr[right] * arr[right];			// 0, 9, , , 49
                right--;
            }
        }
        for(int i = 0; i < arraySize; i++)
            System.out.print(sorted[i]+" ");;
        scanner.close();
	}

}
