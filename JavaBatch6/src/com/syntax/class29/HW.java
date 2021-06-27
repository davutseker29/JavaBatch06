package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HW {

	public static void main(String[] args) {

		/*
		 * create a map of a building store floor number and it is associated company
		 * name(1=Google, 2= syntax)insert 7 entries with duplicate keys and values
		 * check how many entries you have update company on a 4th floor remove company
		 * on the 7th floor print your map
		 */

		Map<Integer, String> hw = new HashMap<>();

		hw.put(1, "Google");
		hw.put(2, "IT");
		hw.put(3, "Google");
		hw.put(4, "Law office");
		hw.put(5, "Food courte");
		hw.put(6, "Doctor office");
		hw.put(7, "Doctor office");
		
		

		// print the map
		System.out.println(hw);

		// number of entries
		System.out.println("number of entries are:" + hw.size());

		// update the company on the 4th floor
		hw.replace(4, "dentist");
		System.out.println(hw);

		// remove the 7th floor
		hw.remove(7);
		System.out.println(hw);

		// printing the keys

		Set<Integer> hwkey = hw.keySet();
		//1st way to print keys
		System.out.println("==================1st way of printing all keys==================");
		for(Integer key:hwkey) {
			System.out.println(key);
		}
		
		//2nd way of printing all keys
		System.out.println("===============2nd way of getting all keys====================");
		Iterator<Integer>keys=hwkey.iterator();
		while(keys.hasNext()) {
			int nums = keys.next();
			
			System.out.println("key is "+nums+" its value is "+hw.get(nums));
		}
		
		
		//printing all values
		System.out.println("===========printing all values=============");
		Collection<String>values=hw.values();
		for(String val:values) {
			System.out.println(val);
		}
		
		//printing all values 2
		System.out.println("============printing all values 2===============");
		Iterator<String> valu=values.iterator();
		while(valu.hasNext()) {
			System.out.println(valu.next());
			
		}
		System.out.println("=============printing all=============");
		//printing all
		 Set<Entry<Integer, String>> kv = hw.entrySet();
		 
		 for(Entry<Integer, String> kvv:kv) {
			 System.out.println();
		 }
		 System.out.println("============printing all===============");
		 //2nd way
		 Iterator<Entry<Integer, String>> entr = kv.iterator();
		 while (entr.hasNext()) {{
			 System.out.println(entr.next());
		 }
			
		}
		
	}

}
