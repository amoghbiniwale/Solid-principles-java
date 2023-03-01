package com.aurionpro.model;

public class TaxCalculator {
	private DBLogger dbLogger;

	public TaxCalculator(DBLogger dbLogger) {
		super();
		this.dbLogger = dbLogger;
	}
	
	public int calculateTax(int amount, int rate) {
		int tax= 0;
		try {
		tax = amount/rate;
		System.out.println(tax);
		}catch(Exception e) {
			new DBLogger().log("divide by 0");
		}
		return tax;
		
	}
}
