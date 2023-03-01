package com.aurionpro.model;

public class SalarySlipPrinter {
	public void printSalarySlip(Employee employee) {
		System.out.println("id: "+employee.getId());
		System.out.println("name: "+employee.getName());
		System.out.println("Salary: "+employee.getSalary());
		System.out.println("Tax: "+ new Tax ().calculateTax(employee));
	}
}
