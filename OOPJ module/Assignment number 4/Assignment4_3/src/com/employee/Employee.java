package com.employee;

public abstract class Employee {
	private String name;
	private int id;
	protected double salary;
	
	public Employee() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("%-5d%-20s%-10f", this.id,this.name, this.salary);
	}
	public abstract void calculatePay();
	
}
