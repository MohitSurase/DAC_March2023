package com.main;

import com.management.Management;

public class Program {

	
	public static void main(String[] args) {
		int choice;
		Management mg=new Management();
		while((choice=Management.menuList())!=0) {
			switch(choice) {
			case 1 :
				mg.acceptRecord();
				break;
			case 2: 
				mg.payroll();
				break;
			case 3 : 
				mg.printRecord();
				break;
				
			}
		}

	}

}
