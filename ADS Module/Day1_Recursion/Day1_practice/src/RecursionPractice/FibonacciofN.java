package RecursionPractice;

public class FibonacciofN {

	public static void main(String[] args) {
		   int count=10;
		   int a=0,b=1;
		   System.out.print(a+" "+b);
		   fibonacci(a,b,count-2);
		   

	}

	private static void fibonacci(int a, int b, int count) {
		if(count==0) {
			return;
		}
		int c=a+b;
		System.out.print(" "+c);
		fibonacci(b,c,count-1);
	}

}
