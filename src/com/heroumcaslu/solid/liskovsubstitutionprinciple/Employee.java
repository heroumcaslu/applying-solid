package com.heroumcaslu.solid.liskovsubstitutionprinciple;

public abstract class Employee implements Payable {
	
	public abstract double getSalary();
	
	public abstract void setSalary(double salary);

}
