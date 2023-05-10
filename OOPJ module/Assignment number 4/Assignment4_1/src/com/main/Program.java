package com.main;

import Hospital.HospitalManagement;

public class Program {

	public static void main(String[] args) {
		int choice;
		HospitalManagement hm=new HospitalManagement();
		while((choice=HospitalManagement.menuList())!=0) {
			switch(choice) {
			case 1: hm.addPatientRecord();
				break;
			case 2: hm.addMeidcalRecord();
				break;
			case 3: hm.getPatientRecord();
				break;
			case 4: hm.getMedicalRecord();
				break;
			}
		}
	}

}
