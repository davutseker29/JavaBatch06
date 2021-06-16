package com.syntax.class27;

public class RecapTest {
	
	public static void main(String []args) {
		
		Recap obj=new Recap();
		obj.setLastname("ziya");
		obj.setName("sengul");
		
		String names=obj.getName();
		String lastnames=obj.getLastname();
		
		System.out.println(names+" "+lastnames);
	}

}
