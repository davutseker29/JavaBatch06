package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayAndIterator {

	public static void main(String[] args) {

		// lets create an ArrayList of chocolate

		ArrayList<String> choco = new ArrayList<>();

		choco.add("kinder");
		choco.add("godiva");
		choco.add("kitkat");
		choco.add("snikers");
		
		//create arraylist of sweets
		
		ArrayList<String> sweets=new ArrayList<>();
		
		sweets.add("ice cream");
		sweets.add("cheese cake");
		sweets.addAll(choco);
		
		System.out.println(sweets.size());
		System.out.println(sweets);
		
		//1st way
		
		for (int i = 0; i < sweets.size(); i++) {
			String swt = sweets.get(i);
			System.out.print(swt+"  ");	
		}
		System.out.println();
		
		//2nd way
		
		for(String str:sweets) {
			System.out.print(str+"  ");
		}
		System.out.println();
		
		for (int j = sweets.size()-1; j>=0; j--) {
			
			String see = sweets.get(j);
			System.out.print(see+"  ");	
		}
		System.out.println();
		Iterator<String> swet = sweets.iterator();
		while(swet.hasNext()) {
			String st = swet.next();
			if(st.equals("godiva")) {
				swet.remove();
			}
			
		}
		System.out.print(sweets+"  ");
	}

}
