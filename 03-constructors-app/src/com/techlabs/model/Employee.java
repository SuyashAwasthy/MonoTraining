package com.techlabs.model;

public class Employee {
	private int salary;
	private int employeeId;
	private String name;
	
	public Employee(){	//default 
		salary=1000;
		employeeId=1001;
		name="EName";
	}
	
	public Employee(String name2, int employeeId2, int salary2) {	//parameterized
		name=name2;
		employeeId=employeeId2;
		salary=salary2;
	}
	
	public Employee(Employee employee) {	//parameterized (copy)
		name=employee.getName();
		salary=employee.getSalary();
		employeeId=employee.getEmployeeId();
	}
	
	public void setSalary(int salary1) {
		salary=salary1;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setName(String name1) {
		name=name1;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmployeeId(int employeeId1) {
		employeeId=employeeId1;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
}
