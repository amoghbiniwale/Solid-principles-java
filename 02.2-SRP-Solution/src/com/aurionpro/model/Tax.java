package com.aurionpro.model;

public class Tax {
	public double calculateTax(Employee employee) {
		if(employee.getSalary() *12<500000) {
			return 0.0;
		}
		return employee.getSalary() * 0.2;
	}
}
