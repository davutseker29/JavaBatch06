package com.syntax.class17;

public class BuildACar {
	
	String color;
	String model;
	int year;
	int door;
	
	static String brand="Subaru";
	static int price=20000;
	static boolean brandNew=true;
	
	
	static void whatIWant() {
		System.out.println("i want a car upto "+price+".it has to be definitly "+brand +" and "+brandNew);
	}
	
	void whatIGot() {
		System.out.println("i purhcased a car with "+color+" color.its model is "+model+" it is "+year+" years old and "+door+" door");
	}
	
	public static void main(String[] args) {
		
		
		
		BuildACar obj=new BuildACar();
		
		BuildACar.whatIWant();
		
		obj.color="white";
		obj.door=4;
		obj.model="SUV";
		obj.year=2;
		System.out.println("==============================");
		obj.whatIGot();
	}

}
