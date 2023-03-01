package com.aurionpro.model;

public class Robot implements IWorker {

	@Override
	public void start() {
		System.out.println("robot is started");
	}

	@Override
	public void stop() {
		System.out.println("robot is stoped");
	}

	@Override
	public void eat() {
		System.out.println("robot can not eat");
	}

	@Override
	public void rest() {
		System.out.println("robot can not take rest");
	}

}
