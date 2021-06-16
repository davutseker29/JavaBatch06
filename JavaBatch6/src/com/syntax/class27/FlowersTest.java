package com.syntax.class27;

import java.util.ArrayList;

public class FlowersTest {
	
	public static void main(String[] args) {
		
		//flowers into array
		
		Flowers [] flw={new Roses("Rose"),new Sunflowers("sunflowers"),new Tulips("tulip","red")};

		ArrayList<Flowers> flower = new ArrayList<>();
		flower.add(new Roses("Rose"));
		flower.add(new Sunflowers("sunflowers"));
		flower.add(new Tulips("tulip","red"));
		
		
		int num=flower.size();
		System.out.println(num);
		
		for (int i = 0; i < flower.size(); i++) {
			
			Flowers ss = flower.get(i);
					System.out.println(ss);
			
		}
		
		
	}

}
