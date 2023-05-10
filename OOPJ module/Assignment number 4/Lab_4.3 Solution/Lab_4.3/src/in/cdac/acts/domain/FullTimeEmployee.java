package in.cdac.acts.domain;

public class FullTimeEmployee extends Employee{
	private double bonus;
	public FullTimeEmployee() {
		// TODO Auto-generated constructor stub
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void calculateBonus( ) {
		this.bonus = this.salary * 0.1;
	}
	@Override
	public void calculatePay() {
		this.salary = this.salary + this.bonus;
	}
}
