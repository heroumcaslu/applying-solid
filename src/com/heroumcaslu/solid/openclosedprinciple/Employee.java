package com.heroumcaslu.solid.openclosedprinciple;

public class Employee implements Payable {

	//Open for extension closed to modification
	private double salary;
	
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

	@Override
	public void setSalary(double salary) {
		// TODO Auto-generated method stub
		this.salary = salary;
		
	}

}
