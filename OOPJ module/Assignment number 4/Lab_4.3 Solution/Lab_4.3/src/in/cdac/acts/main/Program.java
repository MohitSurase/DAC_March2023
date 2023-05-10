package in.cdac.acts.main;

import in.cdac.acts.test.EmployeeTest;

public class Program {
	public static void main(String[] args) {
		int choice;
		EmployeeTest test = new EmployeeTest();
		while( ( choice = EmployeeTest.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				test.acceptRecord();
				break;
			case 2:
				test.calculateTotalPayroll();
				break;
			case 3:
				test.printRecord();
				break;
			}
		}
	}

}
