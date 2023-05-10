package com.employee;

public class FullTimeEmployee extends Employee {
	private double bonus;
	
	public FullTimeEmployee() {
		
	}
	
	public void setBonus() {
		this.bonus=bonus;
	}
	public void calculateBonus() {
		this.bonus=this.salary*0.1;
	}
	@Override
	public void calculatePay() {
		this.salary=this.salary +this.bonus;
	}
}
