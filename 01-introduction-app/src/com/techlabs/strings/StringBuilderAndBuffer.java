package com.techlabs.strings;

public class StringBuilderAndBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1 = new StringBuffer("A");
		StringBuilder s2 = new StringBuilder("B");
		String s3 = new String("C");
		
		concat1(s1);
		System.out.println(s1);
		concat2(s2);
		System.out.println(s2);
		concat3(s3);
		System.out.println(s3);
	}

	private static void concat3(String s3) {
		// TODO Auto-generated method stub
		s3=s3+"X";
	}

	private static void concat2(StringBuilder s2) {
		// TODO Auto-generated method stub
		s2=s2.append("Y");
	}

	private static void concat1(StringBuffer s1) {
		// TODO Auto-generated method stub
		s1=s1.append("Z");
	}

}
