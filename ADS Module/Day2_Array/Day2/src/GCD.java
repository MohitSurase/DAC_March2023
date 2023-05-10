
public class GCD {
	
	private static int gcd(int i, int j) {
		if(j==0) {
			System.out.println("this is");
			return i;
		}
		else {
			System.out.println("hi");
		return gcd(j ,i%j);
		}
	}
	public static void main(String[] args) {
		int a=366;
		int	b=60;
		int ans=gcd(a,b);
		System.out.println(ans);
	}

	
}
