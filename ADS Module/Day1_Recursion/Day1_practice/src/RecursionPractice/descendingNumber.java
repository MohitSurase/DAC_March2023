package RecursionPractice;

public class descendingNumber {
	private static void descendingNumber(int i) {
		if(i==0) {
			return;
		}
		System.out.print(i+ " ");
		descendingNumber(i-1);

	}

	public static void main(String[] args) {
		descendingNumber(5);

	}

	
}
