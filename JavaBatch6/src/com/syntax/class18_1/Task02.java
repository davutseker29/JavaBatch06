package com.syntax.class18_1;

public class Task02 {

	String studentName;
	int subject1;
	int subject2;
	int subject3;

	void average() {
		int ave;
		ave = (subject1 + subject2 + subject3) / 3;
		System.out.println("my average is "+ave);
		
	}

	Task02(String name, int sub1, int sub2, int sub3) {
		studentName = name;
		subject1 = sub1;
		subject2 = sub2;
		subject3 = sub3;
	}

	public static void main(String[] args) {

		Task02 task = new Task02("ziya", 90, 86, 54);
		task.average();
		
		Task02 task1=new Task02("hakki",79,76,87);
		task1.average();
		
	}
}
