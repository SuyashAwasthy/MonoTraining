package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student student1 = new Student();
//		System.out.println("Student1:");
//		System.out.println(student1.getName()+" , "+student1.getRollNumber()+" , "+student1.getAge());
//		student1.setName("Suyash");
//		student1.setRollNumber(1);
//		student1.setAge(23);
//		System.out.println(student1.getName()+" , "+student1.getRollNumber()+" , "+student1.getAge());
//	
//		Student student2 = new Student(student1);
//		student2=student1;
//		System.out.println("\nStudent2:");
//		System.out.println(student2.getName()+" , "+student2.getRollNumber()+" , "+student2.getAge());
//
//		
//		Student student3 = new Student("Raghav",3,25);
//		System.out.println("\nStudent3:");
//		System.out.println(student3.getName()+" , "+student3.getRollNumber()+" , "+student3.getAge());
		
		Scanner scanner = new Scanner(System.in);
		
		Student students[]=new Student[3];
		
		for(int i=0;i<students.length;i++) {
			students[i]=new Student("Suyash",0,0);
			System.out.println("Enter Student Name:");
			students[i].setName(scanner.next());
			System.out.println("Enter Student Roll Number:");
			students[i].setRollNumber(scanner.nextInt());
			System.out.println("Enter Student Age:");
			students[i].setAge(scanner.nextInt());
			System.out.println("Enter Student email ID:");
			students[i].setEmail(scanner.next());
		}
		
		for(Student student:students) {
			System.out.println(student);
		}
		
		scanner.close();
		
	}

}
