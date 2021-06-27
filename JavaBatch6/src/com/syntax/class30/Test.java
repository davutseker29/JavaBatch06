package com.syntax.class30;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
	Map<Object, Object> ll=new LinkedHashMap<>();
	ll.put(1, new CIBC("cibc",true,150000));
	ll.put(2, new TD("td",true,2000000));
	
	Collection<Object> l=ll.values();
	for (Object obj : l) {
		System.out.println(obj);
	}
	}

}
