package com.techlabs.model;

public class Employee {
	private int id;
	private String name;
	private int salary;
	
	public void setEmployeeId(int id2) {
		id = id2;
	}
	
	public void setName(String name2) {
		name = name2;
	}
	
	public void setSalary(int salary2) {
		salary = salary2;
	}
	
	public int getEmployeeId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
//	public void initializeStudent(int id2, String name2, int salary2) {
//		id=id2;
//		name=name2;
//		salary=salary2;
//	}
//	
//	public void displayStudent() {
//		System.out.println("Id: "+id);
//		System.out.println("Name: "+name);
//		System.out.println("Salary: "+salary);
//	}
}
