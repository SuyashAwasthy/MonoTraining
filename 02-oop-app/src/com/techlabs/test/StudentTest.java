package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Student student1 = new Student();
		
		System.out.println("Enter details of first student: ");
		
		System.out.println("Enter roll number: ");
		int rollNumber = scanner.nextInt();
		
		System.out.println("Enter name: ");
		String name = scanner.next();
		
		System.out.println("Enter age");
		int age = scanner.nextInt();
		
		student1.setRollNumber(rollNumber);
		student1.setName(name);
		student1.setAge(age);
		
		System.out.println("Roll number: "+student1.getRollNumber());
		System.out.println("Name: "+student1.getName());
		System.out.println("Age: "+student1.getAge());
		
		Student student2 = new Student();
		
		System.out.println("\nEnter details of second student: ");
		
		System.out.println("Enter roll number: ");
		rollNumber = scanner.nextInt();
		
		System.out.println("Enter name: ");
		name = scanner.next();
		
		System.out.println("Enter age");
		age = scanner.nextInt();
		
		student2.setRollNumber(rollNumber);
		student2.setName(name);
		student2.setAge(age);
		
		System.out.println("Roll number: "+student2.getRollNumber());
		System.out.println("Name: "+student2.getName());
		System.out.println("Age: "+student2.getAge());
		
		
		scanner.close();
	}

}
