package com.monocept.test;

import com.monocept.model.FestivalType;
import com.monocept.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fixdeposit1 =new FixedDeposit(1,"amogh",5000,2, FestivalType.Holi);
		System.out.println(fixdeposit1);
		
		FixedDeposit fixdeposit2 =new FixedDeposit(1,"sam",4000,2, FestivalType.Diwali);
		System.out.println(fixdeposit2);
		
		FixedDeposit fixdeposit3 =new FixedDeposit(1,"ram",3000,2, FestivalType.Gapati);
		System.out.println(fixdeposit3);
		
		FixedDeposit fixdeposit4 =new FixedDeposit(1,"amogh",5000,2, FestivalType.Others);
		System.out.println(fixdeposit4);
		
	}

}
