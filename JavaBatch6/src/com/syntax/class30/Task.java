package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task {

	public static void main(String[] args) {
		
		Map<String, Integer> month=new LinkedHashMap<>();
		month.put("January", 31);// entry
		month.put("February", 28);
		month.put("March", 31);
		month.put("April", 30);
		
		int num=month.size();
		System.out.println(num);
		
		//get all entries from a map
		System.out.println("=====1st way=====");
		
		 Set<Entry<String, Integer>> entry = month.entrySet();
		 for(Entry<String,Integer> ent:entry) {
			 System.out.println(ent.getKey()+" "+ent.getValue());
			 
		 }
		 System.out.println("=============");
		Iterator<Entry<String, Integer>> en= entry.iterator();
		while(en.hasNext()) {
			Entry<String, Integer> e=en.next();
			String str = e.getKey();
			Integer nums = e.getValue();
			System.out.println(str+" "+nums);
		}
		 
		 
	}

}
