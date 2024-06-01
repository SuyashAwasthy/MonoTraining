package com.techlabs.arrays;

import java.util.Scanner;

public class MultiplicationOf2dMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Enter the number of rows in matrix1: ");
        int rows1 = scanner.nextInt();
        
        System.out.println("Enter the number of columns in matrix1: ");
        int columns1 = scanner.nextInt();
        
        System.out.println("Number of rows in matrix2 =  "+columns1); //for multiplication of matrices, row2 must be equal to columns1 else multiplication is not possible
        int rows2 = columns1;										  
        
        System.out.println("Enter the number of columns in matrix2: ");
        int columns2 = scanner.nextInt();
        
        int array1[][] = new int[rows1][columns1];
        int array2[][] = new int[rows2][columns2];
        System.out.println("Enter the elements of first 2-d array: ");
        
        for (int i = 0; i < rows1; i++) {
        	System.out.println("Enter "+(i+1)+" row elements");
        	for(int j = 0; j < columns1; j++) {
        		array1[i][j] = scanner.nextInt();
        	}
        }
        
        System.out.println("Enter the elements of second 2-d array: ");
        
        for (int i = 0; i < rows2; i++) {
        	System.out.println("Enter "+(i+1)+" row elements");
        	for(int j = 0; j < columns2; j++) {
        		array2[i][j] = scanner.nextInt();
        	}
        }
        
        System.out.println("Resultant 2-d array: ");
        
        int multipliedArray[][] = new int[rows1][columns2]; 
        for (int i = 0; i < rows1; i++) { 
            for (int j = 0; j < columns2; j++) { 
                for (int k = 0; k < rows2; k++) 
                    multipliedArray[i][j] += array1[i][k] * array2[k][j]; 
            } 
        } 
        
        for (int i = 0; i < rows1; i++) {
        	for(int j = 0; j < columns2; j++) {
        		System.out.print(multipliedArray[i][j]+" ");
        	}
        	System.out.println();
        }
        scanner.close();
	}

}
