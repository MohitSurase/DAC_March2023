package Hospital;

import java.util.Scanner;

import com.patient.Patient;
import com.record.PatientRecord;
import com.record.MedicalRecord;

public class HospitalManagement {
	
	
	
	static Scanner sc=new Scanner(System.in);
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Add Patient Record");
		System.out.println("2.Add Medical Record");
		System.out.println("3.Print Patient Record");
		System.out.println("4.Print Medical Record(s)");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public void addPatientRecord() {
		Patient p=new Patient();
		p.acceptRecord(p);
		
		MedicalRecord mr=new MedicalRecord();
		mr.acceptRecord(mr);
		
		PatientRecord pr=new PatientRecord();
		pr.setPatient(p);
		pr.set(mr);
	}
	public void addMeidcalRecord() {
		// TODO Auto-generated method stub
		
	}
	public void getPatientRecord() {
		// TODO Auto-generated method stub
		
	}
	public void getMedicalRecord() {
		// TODO Auto-generated method stub
		
	}

}
