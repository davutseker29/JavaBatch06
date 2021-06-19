package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> llist = new LinkedList<>();
		llist.add("Yunus"); // comes from Collection
		llist.add(0, "Reyhan");// comes from List
		llist.add("Pavel");
		llist.add("Farid");
		llist.add("Farid");
		llist.add("Farid");

		System.out.println(llist.size());
		
		//1st way
		
		for (int i = 0; i < llist.size(); i++) {
			String lst=llist.get(i);
			System.out.println(lst);	
		}
		
		//2nd way
		System.out.println("=======2nd way======");
		for (String str : llist) {
			System.out.println(str);
			
		}
		
		//3rd way
		System.out.println("======3rd way======");
		Iterator<String> ist=llist.iterator();
		while (ist.hasNext()) {
			String ista =ist.next();
			System.out.println(ista);
		}
		
//		//can we store objects of user defined classes?
//		List<Food> food=new LinkedList<>();
//		food.add(new Salad("salad", "tomato and cucumber", 100));
//		food.add(new Dessert("desert", "chocolate", 1000));
//		food.add(new MainDish("pasta", "mushrooms", 800));
//		food.add(new MainDish("pasta", "mushrooms", 800));
//		
//		for(Food f:food) {
//			f.calories();
//			f.foodType();
//			f.ingredient();
//			
//			System.out.println("---------------");
//		}
	}
}
