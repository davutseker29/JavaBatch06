package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BankTest {

	public static void main(String[] args) {

		Set<Bank> banks = new HashSet<>();
		banks.add(new RBC("RBC", true, 12));
		banks.add(new CIBC("CIBC", true, 10));
		banks.add(new TD("TD", true, 10));

		System.out.println(banks.size());

		Iterator <Bank> bnk = banks.iterator();
		while(bnk.hasNext()) {
		Bank bankss = bnk.next();
			bankss.allowanceAmount();
			bankss.dailyHours();
		}
		
		
	}

}
