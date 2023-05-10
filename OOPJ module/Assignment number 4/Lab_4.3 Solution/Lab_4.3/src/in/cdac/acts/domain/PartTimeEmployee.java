package in.cdac.acts.domain;

public class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;
	public PartTimeEmployee() {
		// TODO Auto-generated constructor stub
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	@Override
	public void calculatePay() {
		this.salary = this.hoursWorked * this.hourlyRate;
		if( this.hoursWorked > 40 )
			this.salary = this.salary + this.salary * 0.2 * 5; 	
	}
}
