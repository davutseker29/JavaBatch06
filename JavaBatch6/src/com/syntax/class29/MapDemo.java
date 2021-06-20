package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		HashMap<String, String> hmap = new HashMap<>();
		
		//to store values into map we use put
		hmap.put("Name", "John");
		hmap.put("lastname", "smith");
		hmap.put("address", "123 test");
		hmap.put("city", "victoria");
		
		boolean isempty = hmap.isEmpty();
		System.out.println(isempty);
		
		//how many elements
		int num = hmap.size();
		System.out.println(num);
		
		//we can add more entries
		hmap.put("zip", "12334");
		
		//NO duplicates, previous entry replace with the new one
		hmap.put("Name", "lane");
		
		//how access the singlle value
		String str = hmap.get("Name");
		System.out.println(str);
		
		//to remove the value
		hmap.remove("address");
		System.out.println(hmap);
		
		//to replace the value
		hmap.replace("zip", "555555");
		System.out.println(hmap);
		
		//to print all keys 1st way
		Set<String> keys=hmap.keySet();
		for (String strs : keys) {
			System.out.println(strs);
		}
		
		System.out.println("=======2nd way=======");
		//2nd way
		Iterator<String> key = keys.iterator();
		while(key.hasNext()) {
			;
			System.out.println(key.next());
		}
		
		//to print all the values
		System.out.println("========values========");
		Collection<String> coll=hmap.values();
		for(String colls:coll) {
			System.out.println(colls);
		}
		
		
		
		
	}

}
