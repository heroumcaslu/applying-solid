package com.heroumcaslu.solid.openclosedprinciple;

public class Payroll {

	protected double total;
	
	public void total(Payable employee) {
		
		this.total = employee.getSalary();
		
	}
	
}
