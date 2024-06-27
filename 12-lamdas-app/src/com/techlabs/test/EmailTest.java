package com.techlabs.test;

import java.util.function.Predicate;

public class EmailTest {

	public static void main(String[] args) {
		
		Predicate<String> emailPredicate = (string)->{
			if(string.contains("@gmail.com")) 
				return true;
			return false;
		};

		System.out.println(emailPredicate.test("suyash@mail.com"));

	}

}
