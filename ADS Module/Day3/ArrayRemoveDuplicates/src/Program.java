import java.util.Arrays;

public class Program {
	
	public static int removeDuplicates(int[] arr) {
	    if (arr.length == 0 || arr.length == 1) {
	        return arr.length;
	    }
	    // Initialize variables
	    int j = 0;
	    for (int i = 0; i < arr.length - 1; i++) {
	        if (arr[i] != arr[i+1]) {
	            // Increment j and set arr[j] to the current value arr[i+1]
	            j++;
	            arr[j] = arr[i];
	        }
	    }
	    System.out.println(Arrays.toString(arr));
	    // Return the new length of the array
	    return j+1;
	}
	
	public static void main(String[] args) {
		int arr[]=new int[] {20,20,30,40,50,50,50};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int j= removeDuplicates(arr);
		System.out.println(j);
		//System.out.println(Arrays.toString(n));
		
	}

	
}
