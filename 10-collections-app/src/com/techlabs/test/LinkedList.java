package com.techlabs.test;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList(); 
		  
        // Adding elements to the linked list 
        ll.add("A"); 
        ll.add("B"); 
        ll.addLast("C"); 
        ll.addFirst("D"); 
        ll.add(2, "E"); 
  
        System.out.println(ll); 
  
        ll.remove("B"); 
        ll.remove(3); 
        ll.removeFirst(); 
        ll.removeLast(); 
  
        System.out.println(ll); 
	}

	private void remove(int i) {
		// TODO Auto-generated method stub
		
	}

	private void removeLast() {
		// TODO Auto-generated method stub
		
	}

	private void removeFirst() {
		// TODO Auto-generated method stub
		
	}

	private void remove(String string) {
		// TODO Auto-generated method stub
		
	}

	private void addFirst(String string) {
		// TODO Auto-generated method stub
		
	}

	private void add(int i, String string) {
		// TODO Auto-generated method stub
		
	}

	private void addLast(String string) {
		// TODO Auto-generated method stub
		
	}

	private void add(String string) {
		// TODO Auto-generated method stub
		
	}

}
