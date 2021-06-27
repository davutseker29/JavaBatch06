package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class HW {

	public static void main(String[] args) throws IOException {

		//1st step file location
		
		String filePath="C:\\Users\\User\\eclipse-workspace\\JavaBatch6\\configs\\family.properties";
		
		//2nd step fileinputStream
		
		FileInputStream fis=new FileInputStream(filePath);
		
		//3rd Add dictionary
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String cty=prop.getProperty("city");
		System.out.println(cty);
		
		//keys
		
		Set<Object> keys=prop.keySet();
		Iterator<Object> key=keys.iterator();
		while (key.hasNext()) {
			
			System.out.println(key.next());
			
		}
		
		prop.setProperty("state", "BC");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		prop.store(fos, "added new");
	}

}
