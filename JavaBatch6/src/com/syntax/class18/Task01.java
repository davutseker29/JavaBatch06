package com.syntax.class18;

public class Task01 {

	String str;

	public Task01() {

		System.out.println("I am a constructor without a parameter");
	}

	public Task01(String conStr) {

		str = conStr;
		System.out.println("i am a constructor with a " + str);

	}
	

}
