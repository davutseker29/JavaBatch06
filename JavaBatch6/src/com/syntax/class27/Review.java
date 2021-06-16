package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Review {

	public static void main(String[] args) {

		ArrayList<Double> alist = new ArrayList<>();

		alist.add(12.34);
		alist.add(34.44);
		alist.add(9.82);

		boolean check = alist.isEmpty();
		System.out.println(check);

		System.out.println(alist);
		//1st way
		for (int i = 0; i < alist.size(); i++) {
			double d = alist.get(i);
			System.out.println(d);

		}
		//2nd way
		for (Double ds : alist) {
			System.out.print(ds + "  ");
		}
		
		
		//3rd way
		Iterator<Double> iter = alist.iterator();
		while(iter.hasNext()) {
			Double iters = iter.next();
			System.out.println(iters);
		}
		
		ArrayList obj=new ArrayList();
		obj.addAll(alist);
		
		for (Object object : obj) {
			
		}
		
		Iterator it = obj.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}

	}

}
