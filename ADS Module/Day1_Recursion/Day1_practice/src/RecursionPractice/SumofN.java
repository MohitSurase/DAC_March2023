package RecursionPractice;

public class SumofN {
	private static void sumofN(int a, int num, int sum) {
		if(a==num) {
			sum+=a;
			System.out.println(sum);
			return;
		}
		sum+=a;
		sumofN(a+1, num, sum);
		
	}
	
	public static void main(String[] args) {
		int a=1;
		int num=10;
		int sum=0;
		sumofN(a, num, sum);
		
	}



}
