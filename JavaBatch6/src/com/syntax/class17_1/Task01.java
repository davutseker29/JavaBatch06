package com.syntax.class17_1;

public class Task01 {

	/*
	 * create a method that will take a String as a parameter and returns reversed
	 * String. Method should be available to all classes within your project and
	 * accessible by class name
	 */

	public static String getString(String origin) {

		String reverse = "";
		for (int i = origin.length() - 1; i >= 0; i--) {
			reverse += origin.charAt(i);

		}
		System.out.println(reverse);
		return reverse;
	}

	/*
	 * create a method that will accept a String as a parameter and return a new
	 * String that consist only of vowels.Metod should be available inside the class
	 * where it was declared and executed by calling its name
	 */

	private static String getVowels(String sent) {

		String vowels = sent.replaceAll("[^AEIOUaeiou]", "");
		return vowels;

	}

	/*
	 * create a method that will accept an array as parameters and will return a sum
	 * of all visibly only within same package and accessible by the creating an
	 * instance of the class
	 */

	protected int sum(int[] nums) {

		int sums = 0;
		for (int i = 0; i < nums.length; i++) {
			sums = sums + nums[i];

		}
		System.out.println(sums);
		return sums;
	}
	public static void main(String[] args) {
		
		Task01 obj=new Task01();
		int []nums= {2,4,6,7,4,2,4,6};
		obj.sum(nums);
		System.out.println(getVowels("lsakdalds lkdflskf"));
		getString("dfsdf ghgh");
		
		
	}
}
