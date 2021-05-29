package com.syntax.class20;

public class Emp {
	
	public static String company;
	protected int empNumber;
	double salary;
	
	void getPaid() {
		
		System.out.println("Employee get "+salary);
	}
	
	static void workAt() {
		System.out.println("Employees work at "+company);
	}

}
