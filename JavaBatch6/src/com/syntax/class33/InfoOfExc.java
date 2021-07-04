package com.syntax.class33;

public class InfoOfExc {

	public static void main(String[] args) {

		String str="hi";
		try {
		char chars=str.charAt(6);
		
		System.out.println(chars);
		}catch(Exception se) {
			System.out.println(se.getMessage());
			System.out.println(se);
			se.printStackTrace();
		}
	}

}
