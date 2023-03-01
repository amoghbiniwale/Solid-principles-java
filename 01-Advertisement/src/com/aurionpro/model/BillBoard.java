package com.aurionpro.model;

public class BillBoard implements IDisplayable {

	@Override
	public void display(String message) {
		System.out.println("on BillBoard: "+message);
	}

}
