package com.techlabs.test;

import com.techlabs.model.CallMe;
import com.techlabs.model.Caller;

public class CallerTest {

	public static void main(String[] args) {
		
		CallMe target = new CallMe();
		Caller caller1 = new Caller("Hello", target);
		Caller caller2 = new Caller("Suyash", target);
		Caller caller3 = new Caller("Awasthy", target);
		
		try {
			caller1.thread.join();
			caller2.thread.join();
			caller3.thread.join();
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted.");
		}

	}

}
