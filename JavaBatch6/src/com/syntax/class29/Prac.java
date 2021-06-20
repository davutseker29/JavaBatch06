package com.syntax.class29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Prac {

	public static void main(String[] args) {
		
		List<String> alist=new ArrayList<>();
		alist.add("Kaan");
		alist.add("Pamir");
		alist.add("Davut");
		alist.add("Elif");
		alist.add("Kaan");
		alist.add("Elif");
		
		System.out.println(alist.size());
		System.out.println(alist);
		
		System.out.println(alist.get(3));
		
		//to remove the duplicate
		System.out.println("======Set Collections======");
		Set<String> aSet=new LinkedHashSet<>();
		
		aSet.addAll(alist);
		System.out.println(aSet.size());
		System.out.println(aSet);
		
		//convertin array
		Object[] array = aSet.toArray();
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
		}
		
		//Collections
		
		Collections.sort(alist);
		System.out.println(alist);
		
		
		
		

	}

}
