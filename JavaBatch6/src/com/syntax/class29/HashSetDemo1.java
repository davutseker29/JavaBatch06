package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
	
	public static void main(String[] args) {
		
		HashSet<String> hSet=new HashSet<>();
		
		hSet.add("eggs");
		hSet.add("bread");
		hSet.add("tea");
		hSet.add("tea");
		hSet.add("cream cheese");
		hSet.add("coffee");
		
		System.out.println(hSet.size());
		System.out.println(hSet);
		
		Iterator <String> hset=hSet.iterator();
		while(hset.hasNext()) {
			System.out.print(hset.next()+"  ");
		}
		System.out.println();
		
		System.out.println("=========================");
		for (String str : hSet) {
			System.out.println(str);
		}
		
	}

}
