import java.util.Scanner;

class ElectricityBill{

    //fields
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    //parameterless constructor
    public ElectricityBill(){
        this.customerName=customerName;
        this.unitsConsumed=unitsConsumed;
    }

    //Getter and Setter Methods
    public void setcustomerName(String customerName){
        this.customerName=customerName;
    }
    public String getcustomerName(){
        return this.customerName;
    }

    public void setunitsConsumed(double unitsConsumed){
        this.unitsConsumed=unitsConsumed;
    }
    public Double getunitsConsumed(){
        return this.unitsConsumed;
    }

    public double calculateBillAmout(){
    if(this.unitsConsumed<100){
        this.billAmount=this.unitsConsumed*5;
    }
    if(this.unitsConsumed>100 && this.unitsConsumed<200){
        this.billAmount=(100*5)+(this.unitsConsumed-100)*7;
    }
    if(this.unitsConsumed>200){
        this.billAmount=(100*5)+(100*7)+(this.unitsConsumed-200)*10;
    }
    return this.billAmount;
}

    public void menuList(){
        System.out.println("1. Accept Record");
        System.out.println("2. Print Record");
        System.out.println("3. Calculate Bill");
        System.out.println("4. Exit ");
    }

}
    


class Program {
    public static void main(String[] args) {
    ElectricityBill eb=new ElectricityBill();
    eb.menuList();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Customer name : ");
    eb.setcustomerName( sc.nextLine() );

    System.out.println("Enter Units Consumed : ");
    eb.setunitsConsumed( sc.nextDouble() );

    eb.calculateBillAmout();

    System.out.println("\nName    : "+eb.getcustomerName()+"\nUnits consumed : "+eb.getunitsConsumed()+
    "\nBill Amount   : "+eb.calculateBillAmout());

    }
}
