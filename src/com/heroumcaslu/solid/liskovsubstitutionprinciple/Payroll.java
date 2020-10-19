package com.heroumcaslu.solid.liskovsubstitutionprinciple;

public class Payroll {

	protected double total;
	
	//I can inject any Payable object and it must work.
	public void total(Payable payable) {
		
		this.total = payable.getSalary();
		
	}
	
}
