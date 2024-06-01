package com.techlabs.model;

public class Student {
	private int rollNumber;
	private String name;
	private int age;
	
//	public void initializeStudent(int rollNumber2, String name2, int age2) {
//		rollNumber=rollNumber2;
//		name=name2;
//		age=age2;
//	}
	
	public void setRollNumber(int rollNumber2) {
		rollNumber = rollNumber2;
	}
	
	public void setName(String name2) {
		name = name2;
	}
	
	public void setAge(int age2) {
		age = age2;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
//	public void displayStudent() {
//		System.out.println("Roll number: "+rollNumber);
//		System.out.println("Name: "+name);
//		System.out.println("Age: "+age);
//	}
}
