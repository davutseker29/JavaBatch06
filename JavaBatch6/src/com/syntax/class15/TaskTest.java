package com.syntax.class15;

public class TaskTest {
	
	public static void main(String[] args) {
		
		Task01 obj=new Task01();
		
		obj.even(44);
		String language=obj.hello("Kuwait");
		System.out.println(language);
		int largest=obj.larger(21,83);
		System.out.println(largest);
		String str3 = obj.palindrome("eyedippideye");
		System.out.print(str3+"  ");
		
		
	}

}
