package com.syntax.class26;

import java.util.ArrayList;

public class ArrayBegin {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("Davut");
		arrayList.add("Elif");
		arrayList.add("Vedat");
		arrayList.add("Sedat");

		String str = arrayList.get(1);
		System.out.println(str);

		int length = arrayList.size();
		System.out.println(length);

		for (String string : arrayList) {
			System.out.println(string);
		}

		for (int i = 0; i < arrayList.size(); i++) {
			String str2 = arrayList.get(i);
			System.out.println(str2);
		}
	
		
	}

}
