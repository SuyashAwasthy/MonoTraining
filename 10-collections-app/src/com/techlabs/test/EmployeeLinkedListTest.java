package com.techlabs.test;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.LinkedList;


import com.techlabs.model.EmployeeLinkedList;

public class EmployeeLinkedListTest {

	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many employeees:");
		int count=scanner.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Enter details for employee "+(i+1)+" :");
			System.out.println("Enter the Id : ");
			int employeeId=scanner.nextInt();
			System.out.println("Enter name : ");
			String employeeName=scanner.next();
			System.out.println("Enter salary : ");
			double salary=scanner.nextDouble();
			EmployeeLinkedList employee=new  EmployeeLinkedList(employeeId, employeeName, salary);
			list.add(employee);
		}
		Iterator emp=list.iterator();
		while(emp.hasNext()) {
			System.out.println(emp.next());
		}
		ListIterator emp1=list.listIterator();
		while(emp1.hasNext()) {
			System.out.println(emp1.next());
		}
		while(emp1.hasPrevious()) {
			System.out.println(emp1.previous());
		}

	}

}
