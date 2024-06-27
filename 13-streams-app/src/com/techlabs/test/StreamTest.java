package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10,20,30,31);
		System.out.println("All numbers:");
		numbers.stream().forEach((x) -> System.out.println(x+5));
		System.out.println("Al odd numbers:");
		numbers.stream().filter((x)->x%2!=0).forEach((x)->System.out.println(x));
		
		List<Integer> evenNumbers = numbers.stream().filter((x)->x%2==0).collect(Collectors.toList());
		System.out.println("All even numbers:");
		evenNumbers.stream().forEach((x)->System.out.println(x));
		
		int addition = numbers.stream().reduce(0, (sum,x)->sum+x);
		System.out.println("Sum: "+addition);
		
		System.out.println("After multiplying with 5:");
		List<Integer> multiplier = numbers.stream().map((x)->x*5).collect(Collectors.toList());
		multiplier.forEach((x)->System.out.println(x));
		
	}

}
