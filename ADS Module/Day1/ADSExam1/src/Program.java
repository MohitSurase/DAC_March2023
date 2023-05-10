import java.util.Arrays;

public class Program {
	public static void bubblesort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void sort(int[] arr) {
		int left=0, right=arr.length-1;
		int index=0, temp=0;
		
		while(index<=right) {
			if(arr[index]==0) {
				temp=arr[index];
				arr[index]=arr[left];
				arr[left]=temp;
				index++;
				left++;
			}
			else if(arr[index]==1) {
				index++;
			}
			else {
				temp=arr[index];
				arr[index]=arr[right];
				arr[right]=temp;
				right--;
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {0, 2, 2, 1, 1, 1, 2, 1, 2, 1};
		 sort(arr);
		 System.out.println(Arrays.toString(arr));
		 int[] arr2=new int[] {2,2,2,2,0,0,0,0,1,1};
		 sort(arr2);
		 System.out.println(Arrays.toString(arr2));
		 }
	}


