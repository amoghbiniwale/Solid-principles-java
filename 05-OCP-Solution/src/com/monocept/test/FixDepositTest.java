package com.monocept.test;

import com.monocept.model.DiwaliInterest;
import com.monocept.model.FixedDeposit;
import com.monocept.model.GanpatiInterest;
import com.monocept.model.HoliInterest;
import com.monocept.model.OtherInterest;

public class FixDepositTest {
	public static void main(String[] args) {
		
		FixedDeposit fixedDeposit1 = new FixedDeposit(1,"Amogh",1000,1,new HoliInterest());
		System.out.println(fixedDeposit1);
		
		FixedDeposit fixedDeposit2 = new FixedDeposit(2,"sam",2000,1,new DiwaliInterest());
		System.out.println(fixedDeposit2);
		
		FixedDeposit fixedDeposit3 = new FixedDeposit(3,"ram",3000,1,new GanpatiInterest());
		System.out.println(fixedDeposit3);
		
		FixedDeposit fixedDeposit4 = new FixedDeposit(4,"kam",4000,1,new OtherInterest());
		System.out.println(fixedDeposit4);
		
		fixedDeposit1.setInterest(new HoliInterest());
		System.out.println(fixedDeposit1);
	}
	
}
