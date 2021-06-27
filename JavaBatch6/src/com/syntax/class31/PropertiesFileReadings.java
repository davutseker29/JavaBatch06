package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReadings {

	public static void main(String[] args) throws IOException {

		// to read the file"
		// 1.have file
		String filePath = "C:\\Users\\User\\eclipse-workspace\\JavaBatch6\\configs\\Examples.properties";

		// 2.bring object of fileInputStream

		FileInputStream fileInput = new FileInputStream(filePath);

		// 3.to handle data from .properties file we need Property Class
		
	Properties prop=new Properties();
	prop.load(fileInput);
	
	Set<Entry<Object,Object>> allFile=prop.entrySet();
	for (Entry<Object, Object> entry : allFile) {
		System.out.println(entry.getKey()+" = "+entry.getValue());
		
	}
	
	Set<Object>keys=prop.keySet();
	for (Object obj : keys) {
		
		System.out.println(obj);
		
	}
	

}}
