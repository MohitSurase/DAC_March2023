package que7;

import java.util.Scanner;


class Array{
	static Scanner sc = new Scanner(System.in);
	static void transpose(int[][] a, int[][] c) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				c[j][i]=a[i][j];
				System.out.print(c[i][j]+"  ");
			}
			System.out.println(" ");
		}
	}
	
	static void multiply(int[][] a, int[][] b, int[][] c) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				c[i][j]=a[i][j]*b[i][j];
				System.out.print(c[i][j]+"  ");
			}
			System.out.println(" ");
		}
	}
	
	static void subtract(int[][] a, int[][] b, int[][] c) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+"  ");
			}
			System.out.println(" ");
		}
	}
		
	static void sum(int[][] a, int[][] b,int[][] c) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"  ");
			}
			System.out.println(" ");
		}
	}
	static void print(int[][] a, int[][] b) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+"  ");
			}
			System.out.println(" ");	
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				System.out.print(b[i][j]+"  ");
			}
			System.out.println(" ");	
		}
	}
	static void accept(int[][] a, int[][] b) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				b[i][j]=sc.nextInt();
			}
		}
	}
	static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Accept array");
		System.out.println("2.Print array");
		System.out.println("3.Sum");
		System.out.println("4.Subtract");
		System.out.println("5.Multiply");
		System.out.println("6. Transpose");
		System.out.println("Enter Choice");
		return sc.nextInt();
	}
}

public class Program {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row=sc.nextInt();
		System.out.println("Enter number of columns");
		int column=sc.nextInt();
		int a[][]=new int[row][column];
		int b[][]=new int[row][column];
		int c[][]=new int[row][column];		
		int choice;
		while((choice=Array.menuList())!=0)
		{
			switch(choice) {
			case 1: 	Array.accept(a,b);
			break;
		case 2:		Array.print(a,b);
			break;
		
		case 3:		Array.sum(a,b,c);
			break;
		
		case 4:		Array.subtract(a,b,c);
			break;
		
		case 5:		Array.multiply(a,b,c);
			break;
		
		case 6:		Array.transpose(a,c);
			break;
			}
		}	
	}
}
	