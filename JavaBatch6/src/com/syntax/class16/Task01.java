package com.syntax.class16;

public class Task01 {

	/* 1. Create a method createEmail(). Based on provided users name, lastName and
	 * email type, your method should return complete email Address. Example:
	 * johnsnow@gmail.com or johnsnow@yahoo.com* Write a method to return whether
	 * given number is prime or not? 
	 */
	
	String email(String name, String lastName, String emailType) {
		
		String emailAddress = name.concat(lastName).concat(emailType);
		
		return emailAddress;
	}

}
