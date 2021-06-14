package com.syntax.prac;

public class Task01 {
		
	/*
	 * Create a method createEmail(). Based on provided users name, lastName and email type, your method should return complete email Address. 
	 */
		
	String email(String lastName, String userName){
		
		String suffix="@gmail.com";
		String email=userName.concat(lastName).concat(suffix);
		
			return email;
		}	
}


	
	
