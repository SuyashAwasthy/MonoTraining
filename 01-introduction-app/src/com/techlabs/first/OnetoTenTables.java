package com.techlabs.first;

public class OnetoTenTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=10) {
			int j=1;
			while(j<=10) {
				System.out.print((i*j)+"  ");
				j++;
			}
			System.out.println();
			i++;
		}

	}
}
