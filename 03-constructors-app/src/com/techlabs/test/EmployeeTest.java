package com.techlabs.test;

import com.techlabs.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee();
		System.out.println("Employee1:");
		System.out.println(employee1.getName()+" , "+employee1.getEmployeeId()+" , "+employee1.getSalary());
		employee1.setName("Suyash");
		employee1.setEmployeeId(1);
		employee1.setSalary(10000);
		System.out.println(employee1.getName()+" , "+employee1.getEmployeeId()+" , "+employee1.getSalary());
	
		Employee Employee2 = new Employee(employee1);
		Employee2=employee1;
		System.out.println("\nEmployee2:");
		System.out.println(Employee2.getName()+" , "+Employee2.getEmployeeId()+" , "+Employee2.getSalary());

		
		Employee Employee3 = new Employee("Raghav",3,11000);
		System.out.println("\nEmployee3:");
		System.out.println(Employee3.getName()+" , "+Employee3.getEmployeeId()+" , "+Employee3.getSalary());
	}

}
