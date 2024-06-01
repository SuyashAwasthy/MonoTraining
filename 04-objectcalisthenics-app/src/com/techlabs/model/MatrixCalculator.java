package com.techlabs.model;

import java.util.Scanner;

public class MatrixCalculator {

	public static void main(String[] args) {
		
		int matrix[][]=new int[3][3];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter matrix elements");
		
		createRows(matrix,scanner);
		
		displayMatrix(matrix);
		
	}

	private static void displayMatrix(int[][] matrix) {
		
		for(int i=0;i<3;i++)
			displayColumns(i,matrix);
		
	}

	private static void displayColumns(int i,int[][] matrix) {
	
		for(int j=0;j<3;j++)
			System.out.print(matrix[i][j] + " ");
		
		System.out.println();
		
	}

	private static void createRows(int[][] matrix, Scanner scanner) {
		
		for(int i=0;i<3;i++)
			createcolumns(i,matrix,scanner);
		
	}

	private static void createcolumns(int i, int[][] matrix, Scanner scanner) {
		
		for(int j=0;j<3;j++)
			matrix[i][j]=scanner.nextInt();
		
	}

}
