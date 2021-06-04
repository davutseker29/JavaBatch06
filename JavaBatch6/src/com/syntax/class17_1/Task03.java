package com.syntax.class17_1;

public class Task03 {
	
	/*
	 * Create a method that will take a String as a parameter and returns reverse String. 
	 * Method should be available to all classes within your projects and accessible by class name.
	 */
	
	protected void reverse(String str) {
		
		for (int i = str.length()-1; i>=0; i--) {
			char reverse=str.charAt(i);
			
			System.out.println(reverse);
		}
		
	}
		
}
