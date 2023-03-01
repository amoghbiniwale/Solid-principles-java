package com.aurionpro.test;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee(101,"amogh",60000);
		emp.printSalarySlip();
	}

}
