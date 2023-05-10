import java.util.Scanner;

public class BinarySearch {
	static Scanner sc=new Scanner(System.in);
	
	public static int binarySearch(int[] arr,int left, int right, int key) {
		int mid;
		if(left<=right) {
			mid=(left+right)/2;
			if(arr[mid]==key)
				return mid;
			if(key<arr[mid])
				return binarySearch(arr, left, mid-1, key);
			else 
				return binarySearch(arr, mid+1, right, key);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5,6,7,8};
		int key;
		System.out.println("Enter element to find : ");
		key=sc.nextInt();
		
		int index= binarySearch(arr,0,arr.length-1,key);
		if(index!=-1)
			System.out.println(key+" found at index : "+index);
		else
			System.out.println(key+" not found");
	}

}
