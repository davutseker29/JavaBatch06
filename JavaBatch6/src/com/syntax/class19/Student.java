package com.syntax.class19;

public class Student {

	String name, address;
	
	void display() {
		
		System.out.println("My name is "+name+" and i live in "+address);
	}
	
	Student(String name,String address){
		this.name=name;
		this.address=address;
	}
	
	public static void main(String[] args) {
		
		Student obj=new Student("david","victoria, BC");
		
		obj.display();
	}
}
