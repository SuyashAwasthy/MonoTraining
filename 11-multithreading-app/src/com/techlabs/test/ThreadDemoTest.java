package com.techlabs.test;

import com.techlabs.model.MyThread;

public class ThreadDemoTest {

	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread("mythread1");
		MyThread thread2 = new MyThread("mythread2");
		MyThread thread3 = new MyThread("mythread3");
		
		for(int i=3;i>=0;i--) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
