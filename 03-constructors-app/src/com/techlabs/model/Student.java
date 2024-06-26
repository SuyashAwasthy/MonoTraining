package com.techlabs.model;

public class Student {
	private int age;
	private int rollNumber;
	private String name;
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student(){	//default 
		age=0;
		rollNumber=0;
		name="null";
	}
	
	public Student(String name2, int rollNumber2, int age2) {	//parameterized
		name=name2;
		rollNumber=rollNumber2;
		age=age2;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", rollNumber=" + rollNumber + ", name=" + name + ", email ID=" + email +"]";
	}

	public Student(Student student) {	//parameterized (copy)
		name=student.getName();
		age=student.getAge();
		rollNumber=student.getRollNumber();
	}
	
	public void setAge(int age1) {
		age=age1;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name1) {
		name=name1;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRollNumber(int rollNumber1) {
		rollNumber=rollNumber1;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
}
