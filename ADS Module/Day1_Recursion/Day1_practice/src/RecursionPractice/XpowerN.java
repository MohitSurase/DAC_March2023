package RecursionPractice;

public class XpowerN {

	public static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		int powNM1= power(x,n-1);
		int pow=x*powNM1;
		return pow;
		
	}
	public static void main(String[] args) {
		int x=2;
		int n=5;
		int ans=power(x,n);
		System.out.println(ans);

	}

}
