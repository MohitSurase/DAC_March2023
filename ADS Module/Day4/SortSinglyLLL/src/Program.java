import java.util.Arrays;
import java.util.LinkedList;

public class Program {
	
	public static void SelectionSort(LinkedList<Integer> list) {
		Node<Integer> i , j;
		for(i=first;i!=null;i=i.next) {
			for(j=i.next;j!=null;j=j.next) {
				if(i.data>j.data) {
					int temp=i.data;
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(6);
		list.add(4);
		list.add(2);
		list.add(8);
		list.add(3);
		list.add(1);
		Object[] arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		

	}

}
