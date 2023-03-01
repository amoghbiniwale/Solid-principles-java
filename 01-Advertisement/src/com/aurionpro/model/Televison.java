package com.aurionpro.model;

public class Televison implements IDisplayable {

	@Override
	public void display(String message) {
		System.out.println("on Televison: "+message);
	}

}
