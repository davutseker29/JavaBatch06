package com.syntax.class14;

public class TestPhone {
	
	public static void main(String[] args) {
		
		Phone01 obj=new Phone01();
		
		obj.brand="Apple";
		obj.color="black";
		obj.price=1200;
		obj.videoCall=true;
		
		obj.call();
		obj.gps();
		obj.listenMusic();
		
		System.out.println("=============Samsung============");
		Phone01 obj2=new Phone01();
		obj2.brand="samsung";
		obj2.color="black";
		obj2.price=1000;
		obj2.videoCall=true;
		
		obj2.call();
		obj2.gps();
		obj2.listenMusic();
	}

}
