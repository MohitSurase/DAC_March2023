import java.util.Arrays;

public class DuplicateNo {

	
	
	
	public static void main(String[] args) {
		int[] arr=new int[] {0,3,1,2,1,2};
		int[] dup=new int[4];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
				else {
					continue;
				}
			}
		}
		
	}

}
