import java.util.Scanner;

public class Program {
	
	public static int binarySearch(int arr[],int key) {
		int left=0, right=arr.length-1, mid;
		while(left<=right) {
			mid=(left+right)/2;
			if(key==arr[mid])
				return mid;		//if key is found, return mid index;
			if(key<arr[mid])
				right=mid-1;	//if key is less than mid, focus on left part of array;
			else
				left=mid+1;		//if key is greater than mid, focus on right part of array;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//For binary search it is mandatory to have sorted array
		//Binary search should only be used when there is sorted array
		int arr[]=new int[]{11,22,33,44,55,66,77,88,99}; 
		int key;
		
		System.out.println("Enter element you want to find : ");
		key=sc.nextInt();
		
		int index= binarySearch(arr, key);
		
		if(index!=-1)
			System.out.println("Element found at index : "+index);
		else
			System.out.println("Element not found");
	}

}
