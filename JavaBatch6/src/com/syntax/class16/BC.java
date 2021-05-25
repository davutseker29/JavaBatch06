package com.syntax.class16;

public class BC {
	
	String name;
	int population;
	String governor;
	int dogNums;
	
	static String location="BC";
	static boolean immigrant=true;
	static int established=1894;
	
	void cityPort() {
		
		System.out.println(name+" has "+population+" population and governor is "+governor+".City is located in:"+location+" which is established in "+established);
		
	}
	
	public static void main(String[] args) {
		
		BC city1=new BC();
		city1.name="Victoria";
		city1.population=1000000;
		city1.governor="johnny Cash";
		city1.cityPort();
			
		System.out.println(BC.established);
		System.out.println(BC.immigrant);
		System.out.println(BC.location);
		
		System.out.println("=========This is my 2nd city==========");
		BC city2=new BC();
		city2.name="Vancouver";
		city2.population=2500000;
		city2.governor="Bob Dylan";
		city2.cityPort();
	}

	

}
