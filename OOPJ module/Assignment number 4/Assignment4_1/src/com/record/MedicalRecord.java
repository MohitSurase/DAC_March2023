package com.record;

import java.time.LocalDate;
import java.util.Scanner;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class MedicalRecord {
	private String date;
	private String doctorName;
	private String diagnosis;
	private String treatment;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-15s%-10s%-15s%-15s",this.date, this.doctorName, this.diagnosis, this.treatment);
	}
	static Scanner sc = new Scanner(System.in);
	public void acceptRecord(MedicalRecord mr) {
		System.out.println("Date : ");
		this.setDate(sc.nextLine());
		System.out.println("Doctor Name : ");
		this.setDoctorName(sc.nextLine());
		System.out.println("Diagnosis : ");
		this.setDiagnosis(sc.nextLine());
		System.out.println("Treatment : ");
		this.setTreatment(sc.nextLine());
		
	}
	
}
