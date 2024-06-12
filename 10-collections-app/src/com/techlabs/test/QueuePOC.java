package com.techlabs.test;

import java.util.Queue;
import java.util.LinkedList;

public class QueuePOC {

	public static void main(String[] args) {
	
		 Queue<String> queue = new LinkedList<>();
	        queue.add("A");
	        queue.add("B");
	        queue.add("C");
	        System.out.println("Queue: " + queue);
	 
	        String front = queue.remove();
	        System.out.println("Removed element: " + front);
	 
	        System.out.println("Queue after removal: " + queue);
	
	        queue.add("D");
	 
	        String peeked = queue.peek();
	        System.out.println("Peeked element: " + peeked);

	        System.out.println("Queue after peek: " + queue);

	}

}
