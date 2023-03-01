package com.aurionpro.model;

public class FileLogger implements ILogger {

	@Override
	public void log(String str) {
		System.out.println("with file"+str);
	}

}
