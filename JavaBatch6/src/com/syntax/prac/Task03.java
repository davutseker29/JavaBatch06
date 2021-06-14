package com.syntax.prac;

public class Task03 {

	/*
	 * Create a Class called Students Create three variables studentName , studentID
	 * and numberOfStudents Create three objects of the Students Class Set the value
	 * for studentName , studentID and increment the numberOfStudents for each
	 * object Print out total number of students
	 * 
	 */
	
	String studentName;
	long studentID;
	int numberOfStudents;
	
	public void studentInfo() {
		System.out.println(studentName+" with ID of "+studentID);
	}
	Task03(String studentName,long studentID){
		this.studentName=studentName;
		this.studentID=studentID;
		numberOfStudents++;
	}

}
