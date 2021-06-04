package com.syntax.class14;

public class Phone01 {

	/*
	 * Create a Class “Phone”. Create 3 Objects of it: iPhone, AndroidNokia with
	 * specific attributes and behaviors
	 */
	String brand;
	String color;
	int price;
	boolean videoCall;

	void call() {
		System.out.println(brand + " make a videocall:" + videoCall);
	}

	void listenMusic() {
		System.out.println(brand + " can let you listen to music");
	}
	
	void gps() {
		System.out.println(brand+" can let you find your way when you are lost");
	}

}
