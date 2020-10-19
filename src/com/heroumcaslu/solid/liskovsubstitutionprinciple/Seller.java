package com.heroumcaslu.solid.liskovsubstitutionprinciple;

public class Seller extends Employee {
	
	private double salary;
	private double salesAmount;

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary + (this.salesAmount * 0.15);
	}

	@Override
	public void setSalary(double salary) {
		// TODO Auto-generated method stub
		this.salary = salary;
		
	}
	
	public void updateSalesAmount(double salesValue) {
		
		this.salesAmount += salesValue;
		
	}
	
}
