package com.syntax.class20;

public class TestClass01 {
	
	public static void main(String[] args) {
		
		Emp obj=new Emp();
		
		Employee.company="ABC";
		Employee.work();
		
		ScrumTeam01 obj1=new ScrumTeam01();
		obj1.ceremonies="daily standups";
		obj1.salary=233212;
		obj1.attendsMeetings();
		
		ProductOwner obj02=new ProductOwner();
		
		obj02.prioritizeBacklog();
		
		
	}

}
