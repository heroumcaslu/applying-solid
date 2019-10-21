package com.heroumcaslu.solid.ocp;

public class Payroll {

	protected int total;
	
	public void total(Paid employee) {
		
		this.total = employee.getSalary();
		
	}
	
}
