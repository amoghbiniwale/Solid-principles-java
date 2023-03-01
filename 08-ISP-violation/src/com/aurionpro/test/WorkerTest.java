package com.aurionpro.test;

import com.aurionpro.model.IWorker;
import com.aurionpro.model.Loader;
import com.aurionpro.model.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		IWorker loader = new Loader();
		loader.start();
		loader.start();
		loader.eat();
		loader.rest();
		System.out.println("--------------");
		IWorker robot = new Robot();
		robot.start();
		robot.start();
		robot.eat();
		robot.rest();
	}

}
