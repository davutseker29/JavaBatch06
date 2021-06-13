package com.syntax.class22;

public class GreenDoor {

	double salary;

	String jobTitle;

	

	void getPaid() {

		System.out.println(jobTitle + " installer is paid " + salary);
	}

	void jobTitle() {

		System.out.println("We have renevation contructors and flooring installer");
	}

}

class Flooring extends GreenDoor {


	@Override
	void getPaid() {

		System.out.println("flooring installer paid for extras");

	}

}

class renevations extends GreenDoor {

	

	@Override
	protected void jobTitle() {

		System.out.println("we have also helper");

	}
}
