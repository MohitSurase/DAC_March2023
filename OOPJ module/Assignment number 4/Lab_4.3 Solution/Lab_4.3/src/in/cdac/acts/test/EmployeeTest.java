package in.cdac.acts.test;

import java.util.Scanner;

import in.cdac.acts.domain.Employee;
import in.cdac.acts.domain.FullTimeEmployee;
import in.cdac.acts.domain.PartTimeEmployee;

public class EmployeeTest {
	//Step 1
	private Employee[ ] arr = new Employee[ 5 ];
	//Step 2
	public EmployeeTest() {
		arr[ 0 ] = new FullTimeEmployee();	//Upcasting
		arr[ 1 ] = new PartTimeEmployee();	//Upcasting
		arr[ 2 ] = new FullTimeEmployee();	//Upcasting
		arr[ 3 ] = new PartTimeEmployee();	//Upcasting
		arr[ 4 ] = new FullTimeEmployee();	//Upcasting
	}
	//Step 3
	private static Scanner sc = new Scanner(System.in);
	public void acceptRecord( ) {
		for( int index = 0; index < arr.length; ++ index ) {
			//This part is common for both employees
			System.out.print("Name	:	");
			sc.nextLine();
			this.arr[ index ].setName( sc.nextLine());
			System.out.print("Empid	:	");
			this.arr[ index ].setId(sc.nextInt());
			if( this.arr[ index ] instanceof FullTimeEmployee ) {
				FullTimeEmployee emp = (FullTimeEmployee) this.arr[ index ];	//Downcasting
				System.out.print("Basic Salary	:	");
				emp.setSalary(sc.nextDouble());
				emp.calculateBonus();
			}else {
				PartTimeEmployee emp = (PartTimeEmployee) this.arr[ index ];	//Downcasting
				System.out.print("Hours Worked	:	");
				emp.setHoursWorked(sc.nextInt());
				System.out.print("Hourly Rate	:	");
				emp.setHourlyRate(sc.nextDouble());
			}
			arr[index].calculatePay();
		}
	}
	//Step 4
	public void calculateTotalPayroll( ) {
		double total = 0;
		for (Employee emp : this.arr) {
			emp.calculatePay();	//Dynamic method dispatch
			total = total + emp.getSalary();
		}
		System.out.println("Total Payroll	:	"+total);
	}
	//Step 5
	public void printRecord( ) {
		for (Employee emp : this.arr) {
			System.out.println(emp.toString());
		}
	}
	public static int menuList( ) {
		System.out.println("0.Exit.");
		System.out.println("1.Accept Record.");
		System.out.println("2.Calculate total payroll.");
		System.out.println("3.Print Record.");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
}
