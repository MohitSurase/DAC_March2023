package in.cdac.acts.domain;

public class Employee {
	private String name;
	private int id;
	protected double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void calculatePay() {
		
	}
	@Override
	public String toString() {
		return String.format("%-20s%-5d%-10.2f", this.name, this.id, this.salary);
	}
}
