package com.syntax.prac;

public class Task02 {

	/*
	 * Create three variables eID , salary and set the CEO to “Sumair” 
	 * Create two objects of the class Employee 
	 * Set the value of eID, salary for each of the objects 
	 * Print out the eID , salary and CEO for each of the objects 
	 */

	public static String CEO="Sumair";
	double salary;
	int eID;
	
	void description() {
		System.out.println(CEO+ " is the CEO of the company is offering salary of "+salary);
	}
	
	Task02(double salary,int eID){
		this.salary=salary;
		this.eID=eID;
	}

}
