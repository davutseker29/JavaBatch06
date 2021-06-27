package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Animals {

	public static void main(String[] args) {

		Map<String, Integer> animal = new LinkedHashMap<>();
		animal.put("dog", 2);
		animal.put("sheep", 23);
		animal.put("cow", 4);
		animal.put("chicken", 23);
		animal.put("rooster", 1);

		int nums = animal.size();
		System.out.println(nums);

		System.out.println(animal);

		// keys
		Set<String> anim = animal.keySet();
		System.out.println("======1st way=====");
		for (String ani : anim) {
			System.out.println(ani);
		}
		System.out.println("======2nd way=====");
		Iterator<String> an = anim.iterator();
		while (an.hasNext()) {
			String a = an.next();
			System.out.println(a);
		}

		// value
		Collection<Integer> hayvan = animal.values();
		// number of animal
		System.out.println("==========values==========");
		for (Integer hay : hayvan) {
			System.out.println(hay);
		}
		System.out.println("===========2nd way=========");
		Iterator<Integer> hayva = hayvan.iterator();
		while (hayva.hasNext()) {
			int ha = hayva.next();
			System.out.println(ha);
		}

		// print all
		System.out.println("==========entry set===========");
		Set<Entry<String, Integer>> allAnimal = animal.entrySet();
		for(Entry<String,Integer> allAnim: allAnimal) {
		System.out.println(allAnim.getKey()+" = "+allAnim.getValue());
		}
		
		System.out.println("==========2nd way==========");
		Iterator<Entry<String, Integer>> all=allAnimal.iterator();
		while(all.hasNext()) {
			Entry<String, Integer> al = all.next();
			System.out.println(al.getKey()+" = "+al.getValue());
		}

	}

}
