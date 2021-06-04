package com.syntax.class18;

public class Task02 {

	/*
	 * Create a method that will accept a String as a parameter and return a new
	 * String that consist only of vowels. Method should be available inside the
	 * class where it was declared and executed by calling it is name.
	 */
	
	String vowels(String str) {
		
		String vowels=str.replaceAll("[^AEOUI-aeoui]", "");
		
		return vowels;
	}

}
