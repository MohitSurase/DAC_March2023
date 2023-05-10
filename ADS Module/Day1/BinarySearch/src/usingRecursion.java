import java.util.Scanner;

public class usingRecursion {
	public static int binarySearch(int arr[], int left, int right, int key) {
		int mid;
		if(left<=right) {
			mid=(left+right)/2;
			if(key==arr[mid])
				return mid;
			if(key<arr[mid])
				return binarySearch(arr, left,mid-1,key);
			else 
				return binarySearch(arr,mid+1,right,key);
			
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//For binary search it is mandatory to have sorted array
		//Binary search should only be used when there is sorted array
		int arr[]=new int[]{11,22,33,44,55,66,77,88,99}; 
		int n=arr.length-1;
		System.out.println("Enter element you want to find : ");
		int key=sc.nextInt();
		
		int index= binarySearch(arr,0,n,key);
		
		if(index!=-1)
			System.out.println("Element found at index : "+index);
		else
			System.out.println("Element not found");

	}

}
