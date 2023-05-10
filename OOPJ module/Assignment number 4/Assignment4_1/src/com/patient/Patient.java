package com.patient;

import java.util.Scanner;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class Patient {
	private String name;
	private int age;
	private String gender;
	private String address;
	
	@Override
	public String toString() {
		return String.format("%-20s%-5d%-10s%-15s", this.name, this.age, this.gender, this.address);
	}
	static Scanner sc = new Scanner(System.in);
	public void acceptRecord(Patient p) {
		System.out.println("Enter Name : ");
		this.setName(sc.nextLine());
		System.out.println("Age : ");
		this.setAge(sc.nextInt());
		System.out.println("Gender : ");
		this.setGender(sc.nextLine());
		System.out.println("Address : ");
		this.setAddress(sc.nextLine());
		
	}
}
