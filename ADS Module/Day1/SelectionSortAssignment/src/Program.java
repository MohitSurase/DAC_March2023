import java.util.Arrays;

public class Program {
	public static Employee[] getArray() {
		Employee[] arr=new Employee[5];
		arr[0]=new Employee(18,"Virat",31);
		arr[1]=new Employee(7,"Dhoni",41);
		arr[2]=new Employee(45,"Rohit",35);
		arr[3]=new Employee(10,"Sachin",50);
		arr[4]=new Employee(12,"Raina",37);
		return arr;
	}
	
	public static void selectionSort(Employee[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].getAge()>arr[j].getAge()) {
					Employee temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Employee[] arr=Program.getArray();
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("After Sorting by age");
		System.out.println(Arrays.toString(arr));
	}

}
