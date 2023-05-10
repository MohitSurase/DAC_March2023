import java.util.Arrays;

public class Program {
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {    // This loop will run no. of elements -2 times. 
											 //Because for last single element, there is no need to run the loop.

			for(int j=0;j<arr.length-1-i;j++) {  //Everytime this loop will run one time less.
												 //Because after each pass, one element will be sorted
				
				
				if(arr[j]>arr[j+1]) {		//Compare 2 consecutive elements in array
					int temp=arr[j];		//if first element is greater than second then swap	
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr=new int[] {6,4,2,8,3,1};
		System.out.println("Before sorting : \n"+Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After sorting by BubbleSort : \n"+Arrays.toString(arr));
	}

}
