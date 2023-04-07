import java.util.Scanner;

class Telephone {
	private String customerName;
	private String phoneNumber;
	private int callsMade;
	private double duration;
	private int flatRate;
	private double billAmount;
	
	Telephone() {
		this.customerName = null;
		this.phoneNumber = null;
		this.callsMade = 0;
		this.duration = 0;
		this.billAmount=0;
	}
	{
		this.flatRate=10;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getCallsMade() {
		return callsMade;
	}

	public void setCallsMade(int callsMade) {
		this.callsMade = callsMade;
	}

	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public int getFlatRate() {
		return flatRate;
	}

	public void setFlatRate(int flatRate) {
		this.flatRate = flatRate;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	


}



class calculateBill {
	private Telephone t=new Telephone();
	Scanner sc=new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("Enter name : ");
		t.setCustomerName(sc.nextLine());
		
		System.out.println("Enter Number : ");
		t.setPhoneNumber(sc.nextLine());

		System.out.println("Enter Number of calls made : ");
		t.setCallsMade(sc.nextInt());
		
		System.out.println("Enter total duration of calls in mins : ");
		t.setDuration(sc.nextInt());
	}
	
	
	
	public double billAmount() {
		if(t.getCallsMade()<100) {
			t.setBillAmount(t.getFlatRate()+(t.getDuration()*0.50)); 
		}
		if(t.getCallsMade()>100 ) {
			t.setBillAmount(t.getFlatRate()+ (100*0.50) + ((t.getDuration()-100)*0.25)); 
		}
		return t.getBillAmount();
	}
	
	public void printRecord() {
		System.out.println("Name : "+t.getCustomerName()+"\nPhone Number : "+t.getPhoneNumber()+
				"\nBill Amount : "+t.getBillAmount());
	}
	
}



public class Program {

	public static void main(String[] args) {
		calculateBill cb=new calculateBill();
		cb.acceptRecord();
		cb.billAmount();
		cb.printRecord();
		
	}

}
