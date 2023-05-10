import java.util.Arrays;
import java.util.Stack;

public class Program {

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		Stack<Integer> s=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			s.push(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.pop();
		}

		System.out.println(Arrays.toString(arr));
	}

}
