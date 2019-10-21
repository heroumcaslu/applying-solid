package com.heroumcaslu.solid.ocp;

public class Internship implements Paid {

	private int salary;
	
	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

	@Override
	public void setSalary(int salary) {
		// TODO Auto-generated method stub
		this.salary = salary;
		
	}
	
}
