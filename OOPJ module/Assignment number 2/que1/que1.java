import java.util.Scanner;
import java.time.LocalDateTime;

class que1{
  
  //Method
   /*void acceptRecord( ){
    Scanner sc = new Scanner(System.in);
    System.out.print("Day : ");
    day = sc.nextInt();
    System.out.print("Month : ");
    month = sc.nextInt();
    System.out.print("Year  : ");
    year = sc.nextInt();
  }
   void printRecord( ){
    System.out.println( day+" / "+month+" / "+year);
  }*/

  public static void main(String[] args) {
	  int day;
  int month;
  int year;
    LocalDateTime ldt=LocalDateTime.now();
   
    day=ldt.getDayOfMonth();
    month=ldt.getMonthValue();
    year=ldt.getYear();

    System.out.println(day+"/"+month+"/"+year);
   
  }  
}
