package com.techlabs.test;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier=()-> {
			
			Random random = new Random();
			return random.nextInt();
		};
		System.out.println("Random number generated: "+supplier.get());

	}

}
