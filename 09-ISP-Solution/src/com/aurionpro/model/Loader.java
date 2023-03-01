package com.aurionpro.model;

public class Loader implements IWorker {

	@Override
	public void start() {
		System.out.println("start");
	}

	@Override
	public void stop() {
		System.out.println("Stop");
	}

	@Override
	public void eat() {
		System.out.println("eat");
	}

	@Override
	public void rest() {
		System.out.println("rest");
	}

}
