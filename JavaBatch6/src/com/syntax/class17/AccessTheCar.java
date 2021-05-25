package com.syntax.class17;

public class AccessTheCar {
	public static void main(String[] args) {
		
		BuildACar.brand="Mercedes";
		BuildACar.price=25000;
		BuildACar.brandNew=false;
		
		BuildACar.whatIWant();
		
		BuildACar obj=new BuildACar();
		
		obj.color="black";
		obj.door=4;
		obj.model="E";
		obj.year=5;
		
		obj.whatIGot();
		
		
	}

}
