package com.techlabs.test;

import java.util.function.BiFunction; 

public class BinaryOperator {

	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> multiply = (a, b) -> a*b;
		
		int result = multiply.apply(5,3);
		System.out.println("Result: "+result);
		
		BiFunction<String, String, String> combineStrings = (string1,string2) -> string1 + " " + string2;

		String combinedResult = combineStrings.apply("Suyash", "Awasthy");
		System.out.println("Combine string result: "+combinedResult);
		
	}

}
