package com.syntax.class19;

public class Recap2 {

	String state, capitalState;

	Recap2(String state, String capitalState) {
		this.state = state;
		this.capitalState = capitalState;
	}

	public void displayState() {
		System.out.println(state);
	}

	public void displayCapitalState() {
		System.out.println(capitalState);
	}
	
	public void displayAll() {
		displayState();
		displayCapitalState();
	}
	
	public static void main(String[] args) {
		
		Recap2 obj=new Recap2("Georgia","Atlanta");
		obj.displayAll();
	}

}
