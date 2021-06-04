package com.syntax.class15;

public class Task01 {

//	Create a method that will take 2 parameters as a numbers and prints which number is larger.

	int larger(int a, int b) {
		int largest;
		if (a > b) {
			largest = a;
		} else {
			largest = b;
		}
		return largest;
	}
//	Create a method that will take a number and prints whether the number is even or odd.

	boolean even(int num) {
		boolean odd;
		if (num % 2 != 0) {
			odd = true;
			System.out.println("it is odd");
		} else {
			odd = false;
			System.out.println("it is even");
		}
		return odd;
	}

//	Create a method that will print whether given String is palindrome or not.

	String palindrome(String str) {
		
		for (int i = str.length()-1; i >=0; i--) {
			
			char str2 = str.charAt(i);
			System.out.println(str2);
			
		}
		return str;
	}

//	 Create a method that will say Hello in different language based on the country that will passed when method is executed. 

	String hello(String country) {
		String language=null;
		switch (country) {
		case "USA":
			language="Hello";
			break;
			
		case "Turkey":
			language="Turkish";			
			break;
		case "Spain":
			language="Hola";
			break;
		case "Kuwait":
			language="Assalam";
			break;
		}
		return language;
	}

}
