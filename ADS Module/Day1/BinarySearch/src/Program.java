import java.util.Arrays;
import java.util.Scanner;

public class Program {
	public static int binarySearch(int[] arr, int left, int right, int val) {
		int mid;

		if (left <= right) {
			
			mid = (left + right) / 2;
			if (val == arr[mid]) {
				return mid;
			}
			if (val < arr[mid]) {
				return binarySearch(arr, left, mid - 1, val);
			} else {
				return binarySearch(arr, mid + 1, right, val);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter number to find : ");
		int val = sc.nextInt();

		int index = binarySearch(arr, 0, arr.length - 1, val);
		if(index==-1) {
			System.out.println(" not found ");
		}
		else {
			System.out.println(val + " at index " + index);
		}

	}

}
