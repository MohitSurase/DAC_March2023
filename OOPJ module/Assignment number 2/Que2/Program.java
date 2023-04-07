import java.util.Scanner;

class BmiCalculator{
    
    //fields
    private double weight;
    private double height;

    BmiCalculator(){
        
        //Parameterless Constructor    
        this.weight=0;
        this.height=0;
    }

    // Getter Setter Methods
    public void setHeight(double height){
        this.height=height;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }

    public double getWeight(){
        return this.weight;
    }

}

class bmi{
    
    private BmiCalculator bm1= new BmiCalculator();
    
    public void acceptDetails(){    
       
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Weight");
        bm1.setWeight( sc.nextDouble() );

        System.out.println("Enter Height");
        bm1.setHeight( sc.nextDouble() );
    }

    public void printDetails(){    
        System.out.println("Weight   :   "+bm1.getWeight()+"\nHeight    :   "+bm1.getHeight());
    }

    public void calculateBmi(){
        double bmiResult = bm1.getWeight() /(bm1.getHeight()*bm1.getHeight());
        System.out.println("BMI value is    :   "+bmiResult);
    }
        
}


public class Program{
    
    public static void main(String args[]){
 
        bmi bm2=new bmi();
        bm2.acceptDetails();
        bm2.printDetails();
        bm2.calculateBmi();
    }
}