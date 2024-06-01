package com.techlabs.assignments;

public class ProofOfConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arithmetic operators
		 int a = 10;
	     int b = 3; 
	     int c = 7;
	     System.out.println("a + b = " + (a + b));
	     System.out.println("a - b = " + (a - b));
	     System.out.println("a * b = " + (a * b));
	     System.out.println("a / b = " + (a / b));
	     System.out.println("a % b = " + (a % b));
	     
	    //unary operators
	     System.out.println("Postincrement : " + (a++));
	     System.out.println("Preincrement : " + (++a));
	     System.out.println("Postdecrement : " + (b--));
	     System.out.println("Predecrement : " + (--b));
	     
	    //assignment operators
	     System.out.println("c += 3: " + (c += 3));
	     System.out.println("c -= 2: " + (c -= 2));
	     System.out.println("c *= 4: " + (c *= 4));
	     System.out.println("c /= 3: " + (c /= 3));
	     System.out.println("c %= 2: " + (c %= 2));
	     
	    //relational operators
	     System.out.println("a > b: " + (a > b));
	     System.out.println("a < b: " + (a < b));
	     System.out.println("a >= b: " + (a >= b));
	     System.out.println("a <= b: " + (a <= b));
	     System.out.println("a == c: " + (a == c));
	     System.out.println("a != c: " + (a != c));
	     
	    //logical operators
	     boolean x = true;
	     boolean y = false; 
	     System.out.println("x && y: " + (x && y));
	     System.out.println("x || y: " + (x || y));
	     System.out.println("!x: " + (!x));
	     
	    //ternary operator
	     int result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
	     System.out.println("Max of three numbers = " + result);
	     
	    //bitwise operators
	     System.out.println("a & b: " + (a & b));
	     System.out.println("a | b: " + (a | b));
	     System.out.println("a ^ b: " + (a ^ b));
	     
	    //shift operators
	     System.out.println("a<<1 : " + (a << 1));
	     System.out.println("a>>1 : " + (a >> 1));
	     
	}

}
