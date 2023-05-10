import java.util.Arrays;

public class Program {

	public static void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static void quickSort(int[] arr, int left, int right) {
		if(left>=right)
			return;
		int i = 0, j = right;
		
		while (i < j) {
			while (i<=right && arr[i] <= arr[left]) {
				i++;
			}
			while (arr[j] > arr[left]) {
				j--;
			}
			if (i < j) {
				swap(arr, i, j);
			}
		}
		swap(arr, j , left);
		
		quickSort(arr, left, j-1);
		quickSort(arr, j+1, right);

	}

	public static void main(String[] args) {
		int[] arr = { 8, 3, 9, 1, 5, 7, 2, 6, 4 };
		System.out.println(Arrays.toString(arr));

		quickSort(arr, 0, arr.length - 1);
		System.out.println("After quick sort : \n" + Arrays.toString(arr));
	}

}
