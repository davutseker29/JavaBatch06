package com.syntax.class22;

public class Degree {

	/*
	 * Create a class ‘Degree’ having a method ‘getPrerequisite’ that prints “”To
	 * get a degree you need high school diploma”“.  Class ‘Degree’ has 2 subclasses
	 * namely ‘Bachelors’ and Masters’. In Masters class override method
	 * ‘getPrerequisite’.
	 */

	void getPrerequisite() {

		System.out.println("to get a degree you need a high school doploma");
	}
}
class Master extends Degree {

	@Override
	void getPrerequisite() {

		System.out.println("to have a master, you need to have bacheler degree");
	}
}
class Bachelor extends Degree {

}
