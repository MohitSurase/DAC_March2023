package RecursionPractice;

public class FactorialofN {

	private static int fact(int i) {
		if(i==1 || i==0) {
			return 1;
		}
		int factNM1=fact(i-1);
		int fact=i*factNM1;
		System.out.println(fact);
		return fact;
		
	}
	public static void main(String[] args) {
		int fact = fact(5);
		System.out.println("Factorial is : "+fact);

	}


}
