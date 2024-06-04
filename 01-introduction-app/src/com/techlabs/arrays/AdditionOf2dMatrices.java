package com.techlabs.arrays;

import java.util.Scanner;

public class AdditionOf2dMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows in matrices: ");
        int rows = scanner.nextInt();
        
        System.out.println("Enter the number of columns in matrices: ");
        int columns = scanner.nextInt();
        
        int array1[][] = new int[rows][columns];
        int array2[][] = new int[rows][columns];
        System.out.println("Enter the elements of first 2-d array: ");
        
        for (int i = 0; i < rows; i++) {
        	for(int j = 0; j < columns; j++) {
        		array1[i][j] = scanner.nextInt();
        	}
        }
        
        System.out.println("Enter the elements of second 2-d array: ");
        
        for (int i = 0; i < rows; i++) {
        	for(int j = 0; j < columns; j++) {
        		array2[i][j] = scanner.nextInt();
        	}
        }
        
        for(int i = 0; i < rows; i++) {
        	for(int j = 0;j < columns; j++) {
        		array2[i][j]+=array1[i][j];
        	}
        }
        
        System.out.println("Resultant 2-d array: ");
        
        for (int i = 0; i < rows; i++) {
        	for(int j = 0; j < columns; j++) {
        		System.out.print(array2[i][j]+" ");
        	}
        	System.out.println();
        }
        scanner.close();
	}

}
