package com.aurionpro.model;

public class Projector implements IDisplayable {
	@Override
	public void display(String message) {
		System.out.println("on projector: "+message);
	}
}
