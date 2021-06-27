package com.syntax.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Shopping {

	public static void main(String[] args) {

		// lets create a grocery map (item, quantity)in which we do not care about the
		// order
		Map<String, Integer> list = new HashMap<>();
		list.put("milk", 2);
		list.put("tomato", 3);
		list.put("cheese", 1);
		list.put("cucumber", 4);
		list.put("oil", 1);
		System.out.println(list);

		// create a map of items to buy (item, quantity) in which we want save the order
		Map<String, Integer> hhold = new LinkedHashMap<>();
		hhold.put("TV", 1);
		hhold.put("laptop", 4);
		hhold.put("bed", 2);
		hhold.put("couch", 3);
		hhold.put("rug", 4);
		System.out.println(hhold);

		// create a map in which we store all previous items in ascending order
		Map<Object, Object> all = new TreeMap<>();
		all.putAll(hhold);
		all.putAll(list);
		System.out.println(all);

		// get all keys
		Set<Object> keys = all.keySet();
		// 1st way
		System.out.println("=================");
		for (Object key : keys) {
			System.out.println(key);
		}
		// 2nd way
		System.out.println("=================");
		Iterator<Object> ky = keys.iterator();
		while (ky.hasNext()) {
			Object str = ky.next();
			System.out.println(str);

		}

		// get all values
		Collection<Object> valu = all.values();
		System.out.println("=================");
		for(Object val:valu) {
			System.out.println(val);
		}
		System.out.println("=================");
		Iterator<Object>val=valu.iterator();
		while(val.hasNext()) {
			Object va=val.next();
			System.out.println(va);
		}
		
		Set<Entry<Object,Object>>whole=all.entrySet();
		System.out.println("=============");
		//for loop
		for (Entry<Object, Object> entry : whole) {
			System.out.println(entry);
			
		}
		
		//iterator
		System.out.println("=============");
		Iterator<Entry<Object, Object>> whl = whole.iterator();
		while(whl.hasNext()) {
			Entry<Object, Object> wh = whl.next();
			wh.getKey();
			wh.getValue();
		}

	}

}
