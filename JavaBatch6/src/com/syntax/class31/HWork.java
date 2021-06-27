package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class HWork {

	public static void main(String[] args) throws IOException {

		// 1.location
		String filePath = "C:\\Users\\User\\eclipse-workspace\\JavaBatch6\\configs\\homework.properties";

		// 2.bring the java
		FileInputStream fis = new FileInputStream(filePath);

		// 3.load the language to read the document
		Properties prop = new Properties();
		prop.load(fis);

		System.out.println(prop.get("url"));

		prop.setProperty("remind", "information");

		System.out.println("========keys=======");
		Set<Object> keys = prop.keySet();

		System.out.println("====1st way");
		for (Object obj : keys) {
			System.out.println(obj);
		}

		System.out.println("====2nd way");
		Iterator<Object> obje = keys.iterator();
		while (obje.hasNext()) {
			System.out.println(obje.next());

		}

		// value
		System.out.println("=========value========");
		Collection<Object> coll = prop.values();
		
		System.out.println("====1st way");
		for (Object objec : coll) {
			System.out.println(objec);

		}
		
		System.out.println("====2nd way");
		Iterator<Object> iter=coll.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
			
		}
		
		//all
		
		Set<Entry<Object, Object>> entry=prop.entrySet();
		System.out.println("====1st way");
		for(Entry<Object, Object> ent:entry) {
			System.out.println(ent.getKey()+" = "+ent.getValue());
		}
		
		FileOutputStream fos=new FileOutputStream(filePath);
		prop.store(fos, "new info added");
	}

}
