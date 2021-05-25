package com.syntax.class17;

public class Employee1 {

	public static String title;

	/*
	 * create variables to hold: name, last name, title, ssn;
	 */

	public String name;
	protected String lastName;
	double salary;
	private long ssn;

	public static void method01() {
		System.out.println("i am method 1");
	}

	protected void method02() {
		System.out.println("i am method 2");
	}
	
	void method03() {
		System.out.println("i am method 3");
	}
	
	private void method04() {
		System.out.println("i am method 4");
	}
	public void employee() {
		System.out.println("this is an open position for "+title+"."+name+" "+lastName+" is going to be offered for salary of "+salary+" "+ssn);
	}
	
	public static void main(String[] args) {
		
		Employee1 obj=new Employee1();
		
		Employee1.title="QA";
		System.out.println("1st Employee");
		obj.name="john";
		obj.lastName="doe";
		obj.salary=87000;
		obj.ssn=394826483;
		
		
		
		method01();
		obj.method02();
		obj.method03();
		obj.method04();
		obj.employee();
		
		
	}

}
