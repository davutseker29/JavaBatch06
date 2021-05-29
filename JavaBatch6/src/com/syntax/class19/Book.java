package com.syntax.class19;

public class Book {

	String bookName, writerName, type;

	int page;
	
	Book() {

		this("Momo","Michael Ende","fiction",300);
		System.out.println("i am unparametirezed constructor");
	}

	Book(String bookName, String writerName, String type, int page) {
		
		this.bookName = bookName;
		this.writerName = writerName;
		this.type = type;
		this.page = page;
		System.out.println("books name is " + bookName + " and writer is "+writerName + " it is " + type + " total of " + page);
	}

	
	
	public static void main(String[] args) {
		
		Book obj=new Book();
		
	}

}
