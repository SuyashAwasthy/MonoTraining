package com.techlabs.test;

import com.techlabs.exceptions.AgeNotValidException;
import com.techlabs.model.Voter;

public class VoterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Voter voter1 = new Voter("Suyash",20);
			voter1.vote();
			Voter voter2 = new Voter("Raghav",17);
			voter2.vote();
		}
		catch(AgeNotValidException e) {
			System.out.println(e.getMessage());
		}
	}

}
