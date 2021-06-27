package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BestBuy {

	public static void main(String[] args) {

		/*
		 * create a map of Best Buy store
		 * Place item id and item name into it.
		 */
		
		Map<Integer, String> bbuy=new LinkedHashMap<>();
		
		bbuy.put(1111, "Printer");
		bbuy.put(1112, "laptop");
		bbuy.put(1113, "radio");
		bbuy.put(1114, "speaker");
		bbuy.put(1115, "phone");
		bbuy.put(1116, "ac");
		
		System.out.println(bbuy.size());
		System.out.println(bbuy.get(1113));
		
		//Getting keys
		Set<Integer> keys=bbuy.keySet();
		for (Integer key : keys) {
			System.out.println(key);
			
		}
		System.out.println("====2nd way====");
		Iterator<Integer>ke=keys.iterator();
		while(ke.hasNext()) {
			Integer k = ke.next();
			System.out.println(k);
		}
		
		//getting values
		Collection<String> valu=bbuy.values();
		System.out.println(valu);
		
		for(String val:valu) {
			System.out.print(val+"  ");
		}System.out.println();
		
		//print all
		
		Set<Entry<Integer, String>> all=bbuy.entrySet();
		
		for(Entry<Integer,String> al:all) {
			System.out.println(al.getKey()+" = "+al.getValue());
		}
		
		
	}

}
