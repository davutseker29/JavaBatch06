package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class RememberWork {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "\\configs\\remember.properties";

		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();
		prop.load(fis);

		System.out.println(prop.getProperty("name"));

		Set<Object> obj = prop.keySet();
		System.out.println("======================");
		for (Object obje : obj) {
			System.out.println(obje);
		}
		System.out.println("======================");
		Iterator<Object> iter = obj.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());

		}

		System.out.println("========getting value=========");

		Collection<Object> coll = prop.values();
		
		for (Object col : coll) {
			System.out.println(col);	
		}
		
		System.out.println("=========all vvalues==========");
		
		Set<Entry<Object, Object>> entr=prop.entrySet();
		
		for (Entry<Object, Object> ent : entr) {
			
			System.out.println(ent);
			
		}
		System.out.println("=========different way==========");
		Iterator<Entry<Object,Object>> iterat=entr.iterator();
		while (iterat.hasNext()) {
			System.out.println(iterat.next());
			
		}
		
		prop.setProperty("state", "BC");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		prop.store(fos, "just added the state");
	}

}
