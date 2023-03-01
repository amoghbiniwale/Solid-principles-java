package com.aurionpro.model;

public class DBLogger implements ILogger {

	@Override
	public void log(String str) {
		System.out.println("log in by db"+str);
	}

}
