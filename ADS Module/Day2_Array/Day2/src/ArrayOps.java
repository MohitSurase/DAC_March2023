
public class ArrayOps {
	private int[] arr;
	private int n;

	public ArrayOps(int size) {
		arr = new int[size];
		n = 0;
	}

	public void insert(int value) {
		arr[n] = value;
		n++;
	}

	public void display() {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void delete(int value) {
		int j;
		for(j=0;j<n;j++)
		{
			if(arr[j] == value)
				break;
		}
		n--;
		
		for(int k=j;k<n-1;k++)
		{	arr[k]=arr[k+1];
		}
		
	
			
	}

	public static void main(String[] args) {
		ArrayOps a = new ArrayOps(10);

		a.insert(10);
		a.insert(11);
		a.insert(12);
		a.insert(13);
		a.insert(14);
		a.insert(15);
		a.insert(16);
		a.insert(17);
		a.insert(18);
		a.insert(19);

		a.display();

		a.delete(17);
		a.display();

	}

}
