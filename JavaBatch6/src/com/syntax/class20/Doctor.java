package com.syntax.class20;

public class Doctor {
	int doctorId;
	String name;
	
	Doctor(int doctorId,String name){
		
		this.doctorId=doctorId;
		this.name=name;
	}
}

class Dentist extends Doctor {

	Dentist(int doctorId,String name){
		super(doctorId, name);
	}
	
}