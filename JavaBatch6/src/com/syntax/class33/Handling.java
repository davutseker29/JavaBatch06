package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Handling {
	
	public static void main(String[] args) {
	
		try {
		Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println("cathed exception");
		}
		
		String fPath="";
		
		try {
			FileInputStream fis=new FileInputStream(fPath);
		} catch (FileNotFoundException ex) {
			
			System.out.println("cathced exception");
		}
		
		int a=10;
		int b=0;
		
		try {
		int c=a/b;
		}catch(ArithmeticException art) {
			System.out.println(art);
		}

}}
