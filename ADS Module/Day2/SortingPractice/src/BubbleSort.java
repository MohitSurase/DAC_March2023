import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1 ; i++) {
			boolean swap = false;
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if (swap == false)
				break;
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 6, 4, 2, 8, 3, 1 };
		System.out.println("Before sorting : \n" + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After sorting : \n" + Arrays.toString(arr));

	}

}
