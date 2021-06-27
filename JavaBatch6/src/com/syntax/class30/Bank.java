package com.syntax.class30;

public abstract class Bank {

	String name;
	boolean allowance;
	int amount;

	Bank(String name, boolean allowance, int amount) {
		this.name = name;
		this.allowance = allowance;
		this.amount = amount;
	}

	public abstract void companyInfo();

	public abstract void mortgage();
}

 class CIBC extends Bank {

	CIBC(String name, boolean allowance, int amount) {
		super(name, allowance, amount);
	}

	@Override
	public void companyInfo() {
		System.out.println("name");

	}

	@Override
	public void mortgage() {
		// TODO Auto-generated method stub
		
	}
}

class TD extends Bank {

	TD(String name, boolean allowance, int amount) {
		super(name, allowance, amount);

	}

	@Override
	public void companyInfo() {
		System.out.println(name);

	}

	@Override
	public void mortgage() {
		System.out.println(allowance);

	}

}
