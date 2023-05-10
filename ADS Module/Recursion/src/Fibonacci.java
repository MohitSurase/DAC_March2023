import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		
		System.out.print("0 1 ");
		fibo(n-2,0,1);
	}

	private static void fibo(int n, int first, int second) {
		if(n==0)
			return;
		int third= first+second;
		System.out.print(third+" ");
		fibo(n-1, second, third);
	}

}
