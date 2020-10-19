package com.heroumcaslu.solid.liskovsubstitutionprinciple;

public class Manager extends Employee {
	
	private double salary;
	private static double profitSharing;

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary * Manager.profitSharing;
	}

	@Override
	public void setSalary(double salary) {
		// TODO Auto-generated method stub
		this.salary = salary;
		
	}
	
}
