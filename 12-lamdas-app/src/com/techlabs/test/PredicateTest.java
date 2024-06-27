package com.techlabs.test;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		Predicate<Integer> evenPredicate = (number)->{
			if(number%2==0) 
				return true;
			return false;
		};

		System.out.println(evenPredicate.test(10));
		
	}

}
