package com.syntax.class14;

public class DogsTest {
	
	public static void main(String[] args) {
		
		System.out.println("======Husky=====");
		Dogs obj=new Dogs();
		obj.breed="husky";
		Dogs.animal=true;
		obj.fur=true;
		
		Dogs.animal();
		obj.bark();
		obj.friend();
		
		System.out.println("=====kangal=====");
		Dogs obj2=new Dogs();
		Dogs.animal=true;
		obj2.breed="Kangal";
		obj2.fur=true;
		 
		obj2.bark();
		obj2.friend();
		Dogs.animal();
		
		
	}

}
