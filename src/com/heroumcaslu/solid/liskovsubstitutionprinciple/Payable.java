package com.heroumcaslu.solid.liskovsubstitutionprinciple;

/*
 *
 * Objects or entities must be opened to extension and closed to modification.
 * 
 */

public interface Payable {

	public double getSalary();
	void setSalary(double salary);
	
}
