package com.management;

import java.util.Scanner;

import com.employee.Employee;
import com.employee.FullTimeEmployee;
import com.employee.PartTimeEmployee;

public class Management {
	private Employee[] arr = new Employee[5];

	public Management() {
		arr[0] = new FullTimeEmployee();
		arr[1] = new FullTimeEmployee();
		arr[2] = new PartTimeEmployee();
		arr[3] = new FullTimeEmployee();
		arr[4] = new PartTimeEmployee();
	}

	static Scanner sc = new Scanner(System.in);

	public static int menuList() {
		System.out.println("0.Exit.");
		System.out.println("1.Accept Record.");
		System.out.println("2.Calculate total payroll.");
		System.out.println("3.Print Record.");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}

	public void acceptRecord() {
		for (int index = 0; index < arr.length; index++) {
			System.out.print("Enter name");
			arr[index].setName(sc.next());
			System.out.print("Enter ID :");
			arr[index].setId(sc.nextInt());

			if (this.arr[index] instanceof FullTimeEmployee) {

				FullTimeEmployee fte = (FullTimeEmployee) this.arr[index];

				System.out.print("Enter Salary :");
				fte.setSalary(sc.nextDouble());
				fte.calculateBonus();
				fte.calculatePay();
			} else {

				PartTimeEmployee pte = (PartTimeEmployee) this.arr[index];

				System.out.print("Enter hours worked : ");
				pte.setHoursWorked(sc.nextInt());
				System.out.print("Enter Hourly rate : ");
				pte.setHourlyRate(sc.nextDouble());
				pte.calculatePay();
			}

		}

	}

	public void printRecord() {
		for(Employee elm:arr)
			System.out.println(elm);
	}

	public void payroll() {
		double payroll=0;
		for(Employee emp:arr) {
			emp.calculatePay();        
			payroll=payroll+emp.getSalary();
		}
		System.out.println("Total payroll : "+payroll);
	}
}















