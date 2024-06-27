package com.techlabs.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NamesTest {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Jayesh","Nimesh","Mark","Mahesh","Ramesh","Suyash");
		
		System.out.println("First 3 students sorted in ascending order:");
		names.stream().sorted().limit(3).forEach((x)->System.out.println(x));
		
		System.out.println("First 3 students sorted in ascending order if it contains 'a':");
		names.stream().filter((x)->x.contains("a")==true).sorted().limit(3).forEach((x)->System.out.println(x));
		
		System.out.println("Students in descending order:");
		names.stream().sorted(Comparator.reverseOrder()).forEach((x)->System.out.println(x));
		
		System.out.println("First 3 characters of all names:");
		names.stream().forEach((x)->System.out.println(x.substring(0, 3)));
	
		System.out.println("Names of the students that contains less than or equal to 4 characters:");
		names.stream().filter((x)->x.length()<=4).forEach((x)->System.out.println(x));
		
		
	}

}
