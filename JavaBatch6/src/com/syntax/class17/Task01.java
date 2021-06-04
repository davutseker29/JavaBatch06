package com.syntax.class17;

public class Task01 {

	/*
	 * 1. Create a Class called Employee: Create three variables eID , salary and
	 * set the CEO to “Sumair” Create two objects of the class Employee Set the
	 * value of eID, salary for each of the objects Print out the eID , salary and
	 * CEO for each of the objects
	 */

	static String ceo = "Sumair";
	int eID;
	double salary;

	void getPaid() {

		System.out.println(eID + " id employee is paid with salary of " + salary+" by "+ceo);
	}

}
