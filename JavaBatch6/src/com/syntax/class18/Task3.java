package com.syntax.class18;

public class Task3 {
	
	String state;
	String capital;
	
	public void display() {
		
		System.out.println(capital+" is the capital of "+state);
	}
	
	Task3(String state,String capital){
		this.state=state;
		this.capital=capital;
	}
	public static void main(String[] args) {
		
		Task3 obj=new Task3("Georgia","Atlanta");
		obj.display();
	}

}
