package com.syntax.class29;

public abstract class Bank {

	String name;
	boolean allowance;
	int workingHour;

	Bank(String name, boolean allowance, int workingHour) {
		this.name = name;
		this.allowance = allowance;
		this.workingHour = workingHour;
	}

	public abstract void dailyHours();

	public abstract void allowanceAmount();

}

class CIBC extends Bank {

	CIBC(String name, boolean allowance, int workingHour) {
		super(name, allowance, workingHour);
	}

	@Override
	public void dailyHours() {

		System.out.println(name + " daily opens " + workingHour + " hours per day");
	}

	@Override
	public void allowanceAmount() {

		System.out.println(name + " is allowance is upto 100000 depends on your SIN");
	}

}

class TD extends Bank {

	TD(String name, boolean allowance, int workingHour) {
		super(name, allowance, workingHour);
	}

	@Override
	public void dailyHours() {

		System.out.println(name + " daily opens " + workingHour + " hours per day");

	}


	@Override
	public void allowanceAmount() {
		System.out.println(name + " is allowance is upto 150000 depends on your SIN");

	}}

	 class RBC extends Bank {

		RBC(String name, boolean allowance, int workingHour) {
			super(name, allowance, workingHour);
		}

		@Override
		public void dailyHours() {

			System.out.println(name + " daily opens " + workingHour + " hours per day");
		}

		@Override
		public void allowanceAmount() {

			System.out.println(name + " is allowance is upto 200000 depends on your SIN");
		}

	 }

