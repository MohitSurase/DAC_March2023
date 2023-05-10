import java.util.Scanner;

public class Program {

	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[] { 88, 33, 66, 99, 44, 55, 77, 22, 11 };
		System.out.println("Enter element you want to find : ");

		int key = sc.nextInt();
		int index = linearSearch(arr, key);
		if (index != -1)
			System.out.println("Element found at index : " + index);
		else
			System.out.println("Element not found");
	}
}
