package que1;

import java.util.Arrays;
import java.util.Scanner;

public class program {
	static Scanner sc=new Scanner(System.in);

		private static void acceptRecord(int[] arr) {
			for(int i=0;i<arr.length;i++) {
				System.out.print("Enter number : ");
				arr[i]=sc.nextInt();
			}
		}
		
		private static void printRecord(int[] arr) {
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+"  ");
		}
		
		private static void sum(int[] arr) {
			int sum=0;
			for(int i=0;i<arr.length;i++)
				sum=sum+arr[i];
			System.out.println("Sum of all elements :"+sum);
		}
	
		private static void average(int[] arr) {	
			int sum=0,avg=0;
			for(int i=0;i<arr.length;i++)
				sum=sum+arr[i];
			avg=sum/(arr.length);
			System.out.println("Average of all elements :"+avg);
			
		}
		
		private static void smallest(int[] arr) {
			Arrays.sort(arr);
			System.out.println("Smallest element is :"+arr[0]);
		}
	
		private static void largest(int[] arr) {
			Arrays.sort(arr);
			System.out.println("Largest element is :"+arr[arr.length-1]);
			
		}
		private static void ascending(int[] arr) {
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
		}
		private static int menuList() {
			System.out.println("0.Exit");
			System.out.println("1.Accept Record");
			System.out.println("2.Print Record");
			System.out.println("3.Sum");
			System.out.println("4.Average");
			System.out.println("5.Largest Element");
			System.out.println("6. Smallest Element");
			System.out.println("7.Ascending Order");
			System.out.println("Enter Choice");
			return sc.nextInt();
		}
	
	
	public static void main(String[] args) {
		int choice;
		System.out.print("Enter size of array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		while((choice=program.menuList()) !=0) {
			switch(choice) {
			case 1: 	program.acceptRecord(arr);
				break;
			case 2:		program.printRecord(arr);
				break;
			
			case 3:		program.sum(arr);
				break;
			
			case 4:		program.average(arr);
				break;
			
			case 5:		program.largest(arr);
				break;
			
			case 6:		program.smallest(arr);
				break;
			
			case 7:		program.ascending(arr);
				break;			
			}
		}
	}
}
