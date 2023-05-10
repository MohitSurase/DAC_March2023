package com.record;

import java.util.Scanner;

import com.patient.Patient;

public class PatientRecord extends MedicalRecord {
	private int index=0;
	private static int max=10;
	Patient patient=new Patient();
	private MedicalRecord mr=new MedicalRecord();

	static Scanner sc = new Scanner(System.in);

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient p) {
		this.patient = patient;
	}

	public MedicalRecord getMr() {
		return mr;
	}

	public void setMr(MedicalRecord mr) {
		this.mr = mr;
	}

	

	/*public void addPatientRecord(Patient p) {
		
		System.out.println("Enter Name : ");
		p.setName(sc.nextLine());
		System.out.println("Age : ");
		p.setAge(sc.nextInt());
		System.out.println("Gender : ");
		p.setGender(sc.nextLine());
		System.out.println("Address : ");
		p.setAddress(sc.nextLine());
	}*/
}