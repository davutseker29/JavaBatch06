package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 0; i <= 50; i += 2) {
			nums.add(i);
		}
		System.out.println(nums);
		
		Iterator<Integer> num=nums.iterator();
		while(num.hasNext()) {
			if(num.next() % 5==0) {
				num.remove();
			}
			
		}
		System.out.println(nums);
	}

}
