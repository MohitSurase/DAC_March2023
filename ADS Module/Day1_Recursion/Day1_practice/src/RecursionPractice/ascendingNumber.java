package RecursionPractice;

public class ascendingNumber {
	private static void ascendingNumber(int i) {
		if(i==6) {
			return;
		}
		System.out.println(i);
		ascendingNumber(i+1);
		
	}

	public static void main(String[] args) {
		ascendingNumber(1);

	}

	
}
