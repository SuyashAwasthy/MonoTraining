package com.techlabs.model;

import com.techlabs.test.ThreadDemoTest;

public class MyThread extends ThreadDemoTest{

	public MyThread(String name) {
	//	super(name);
	//	start();
	}
	
	public void run() {
		for(int i=3;i>0;i--) {
			//System.out.println(Thread.currentThread.getName()+" : "+i);
			System.out.println();
		}
	}
	
}
