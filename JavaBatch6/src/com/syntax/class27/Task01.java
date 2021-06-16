package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task01 {

	public static void main(String[] args) {

		/*
		 * create an arraylist of cars and retrieve all the values using 3 different
		 * ways Create an arraylist of words remove everyword that ends with "e".use
		 * iterator
		 */

		ArrayList<String> words = new ArrayList<>();
		words.add("merhaba");
		words.add("gelme");
		words.add("kalem");
		words.add("gitme");

		// 1st way

		for (String word : words) {
			System.out.print(word + "  ");
		}
		System.out.println();

		//2nd way
		
		for(int i=0; i<words.size(); i++) {
			String str = words.get(i);
			System.out.print(str+"  ");
		}System.out.println();
		
		//3rd way
		
		Iterator<String> wrd=words.iterator();
		while(wrd.hasNext()) {
			if(wrd.next().endsWith("e")) {
			wrd.remove();	
			}		
		}
		System.out.print(words+"  ");
	}

}
