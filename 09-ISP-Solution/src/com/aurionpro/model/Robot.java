package com.aurionpro.model;

public class Robot implements IWorkable {

	@Override
	public void start() {
		System.out.println("robot is started");
	}

	@Override
	public void stop() {
		System.out.println("robot is stoped");
	}

}
