import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j,temp=arr[i];
			for(j=i-1;j>=0 && arr[j]>temp ;j--) {
				arr[j+1]=arr[j];	
			}
			arr[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 6, 4, 2, 8, 3, 1 };
		System.out.println("Before sorting : \n" + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("After sorting : \n" + Arrays.toString(arr));

	}

}
