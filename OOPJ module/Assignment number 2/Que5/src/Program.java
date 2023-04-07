import java.util.Scanner;


class Telephone{

    private String customerName;
    private String phoneNumber;
    private int callsMade;
    private double durationCall;
    private int flatRate;
    private double billAmount;

    {
        this.flatRate=10;
    }

    public Telephone(){
        this.customerName=null;
        this.phoneNumber=null;
        this.callsMade=0;
        this.durationCall=0;
        this.billAmount=0.0;
        
    }

    public void setcustomerName(String customerName){
        this.customerName=customerName;
    }
    public String getcustomerName(){
        return this.customerName;
    }
    
    public void setphoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getphoneNumber(){
        return this.phoneNumber;
    }

    public void setcallsMade(int callsMade){
        this.callsMade=callsMade;
    }
    public int getcallsMade(){
        return this.callsMade;
    }
    public void setdurationCall(double durationCall){
        this.durationCall=durationCall;
    }
    public double getdurationCall(){
        return this.durationCall;
    }
    public int getflatRate(){
        return this.flatRate;
    }

    public void setbillAmount(double billAmount){
        this.billAmount=billAmount;
    }
    
    public double getbillAmount(){
        return this.billAmount;
    }

}


class Bill{
    
    private Telephone t=new Telephone();
    
    Scanner sc=new Scanner(System.in);
    
    public void acceptRecord(){
        
        System.out.println("Enter name  : ");
        t.setcustomerName(sc.nextLine());

        System.out.println("Enter Phone Number  : ");
        t.setphoneNumber(sc.nextLine());

        System.out.println("Enter number of calls made  : ");
        t.setcallsMade(sc.nextInt());

        System.out.println("Enter duration of calls in mins  : ");
        t.setdurationCall(sc.nextDouble());

    }

    public double calculateBill(){
        if (t.getcallsMade()<100){
            t.setbillAmount(t.getflatRate()+(t.getdurationCall()*0.50));
        }
        if(t.getcallsMade()>100){
            t.setbillAmount(t.getflatRate()+(100*0.50)+((t.getdurationCall()-100)*0.25));
        }   
            return t.getbillAmount();
    }

    public void printRecord(){
        System.out.println("\nCustomer Name : "+t.getcustomerName()+"\nPhone Number  :   "+t.getphoneNumber()+"\nBill Amount  : "+t.getbillAmount());
    }
}


class Program{
    public static void main(String[] args) {
        Bill b=new Bill();
        b.acceptRecord();
        b.calculateBill(); 
        b.printRecord();
             
    }
}