package RecursionPractice;

public class TableOfN {
	public static void table(int n, int x) {
		int ans=0;
		if(x==11) {
			return;
		}
		ans=n*x;
		System.out.println(ans);
		table(n,x+1);
		
		
	}
	public static void main(String[] args) {
		int n=5;
		int x=1;
		table(n,x);

	}

}
