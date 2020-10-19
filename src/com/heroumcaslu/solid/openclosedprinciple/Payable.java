package com.heroumcaslu.solid.openclosedprinciple;

/*
 *
 * Objects or entities must be opened to extension and closed to modification.
 * 
 */

public interface Payable {

	public double getSalary();
	void setSalary(double salary);
	
}
