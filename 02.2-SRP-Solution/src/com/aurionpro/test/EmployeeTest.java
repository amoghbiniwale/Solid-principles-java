package com.aurionpro.test;

import com.aurionpro.model.Employee;
import com.aurionpro.model.SalarySlipPrinter;
import com.aurionpro.model.Tax;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee(101,"amogh",60000);
		//new Tax().calculateTax(emp);
		new SalarySlipPrinter().printSalarySlip(emp);
		System.out.println(new Tax().calculateTax(emp));
		
	}

}
