package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Employee employee1 = new Employee();
		
		System.out.println("Enter details of first employee: ");
		System.out.println("Enter employee id: ");
		int employeeId = scanner.nextInt();
		System.out.println("Enter employee name: ");
		String name = scanner.next();
		System.out.println("Enter employee salary");
		int salary = scanner.nextInt();
		
		employee1.setEmployeeId(employeeId);
		employee1.setName(name);
		employee1.setSalary(salary);
		
		System.out.println("Employee ID: "+employee1.getEmployeeId());
		System.out.println("Name: "+employee1.getName());
		System.out.println("Salary: "+employee1.getSalary());
		
//		employee1.initializeStudent(employeeId,name,salary);
//		employee1.displayStudent();
		
		Employee employee2 = new Employee();
		
		System.out.println("Enter details of second employee: ");
		System.out.println("Enter employee id: ");
		employeeId = scanner.nextInt();
		System.out.println("Enter employee name: ");
		name = scanner.next();
		System.out.println("Enter employee salary");
	    salary = scanner.nextInt();
	    
	    employee2.setEmployeeId(employeeId);
		employee2.setName(name);
		employee2.setSalary(salary);
		
		System.out.println("Employee ID: "+employee2.getEmployeeId());
		System.out.println("Name: "+employee2.getName());
		System.out.println("Salary: "+employee2.getSalary());
	    
//		employee2.initializeStudent(employeeId,name,salary);
//		employee2.displayStudent();
		
		scanner.close();
	}

}
