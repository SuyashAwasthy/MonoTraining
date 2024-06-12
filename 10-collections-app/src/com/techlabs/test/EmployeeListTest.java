package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Employee;

public class EmployeeListTest {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many employees");
		int size = scanner.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter employee ID: ");
			int id = scanner.nextInt();
			System.out.println("Enter employee name: ");
			String name = scanner.next();
			System.out.println("Enter employee salary: ");
			double salary = scanner.nextDouble();
			
			Employee employee = new Employee(id,name,salary);
			employees.add(employee);
		}
		for(int i=0;i<size;i++) {
			System.out.println(employees.get(i));
		}
		
		scanner.close();
		
	}

}
