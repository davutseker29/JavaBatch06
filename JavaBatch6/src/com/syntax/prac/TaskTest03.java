package com.syntax.prac;

public class TaskTest03 {
	
	public static void main(String[] args) {
		
		Task03 obj=new Task03("Johny",0004);
		obj.studentInfo();
		
		Task03 obj1=new Task03("Ferit",0005);
		obj1.studentInfo();
		
		System.out.println(obj.numberOfStudents);
	}

}
