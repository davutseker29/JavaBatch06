package com.syntax.class14;

public class Dogs {

	/*
	 * . Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
	 * Labrador with specific attributes and behaviors.
	 */
	static boolean animal = true;
	String breed;
	boolean fur;

	static void animal() {
		System.out.println("all dogs are animal:" + animal);

	}
	void bark() {
		System.out.println("all dogs bark");
	}
	void friend() {
		System.out.println(breed+" breed is so friendly to human");
	}

}
	
