import java.util.Arrays;

public class Program {
	public static void improvedBubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			boolean swapFlag=false;		//Declared a variable to check if swapping is done in the j loop or not
  			
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapFlag= true;   //if swapping is done, flag will be set to true,
				}				      //if swapping is not done, it indicates that further elements are already sorted
			}
			if(swapFlag==false)		//if further elements are sorted, no need to continue the sorting
				break;				//hence, we will exit the loop
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 6, 4, 2, 8, 3, 1 };
		System.out.println("Before sorting : \n" + Arrays.toString(arr));
		improvedBubbleSort(arr);
		System.out.println("After sorting by BubbleSort : \n" + Arrays.toString(arr));
	}

}
