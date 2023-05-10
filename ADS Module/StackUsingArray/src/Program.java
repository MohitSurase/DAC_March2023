import java.util.Scanner;

class Stack{
	int[] arr;
	int top;
	
	public Stack(int size) {
		arr=new int[size];
		top=-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==arr.length-1;
	}
	
	public void push(int value) {
		if(isFull()) {
			throw new RuntimeException("Stack full");
		}
		else {
			top++;
		arr[top]=value;
		}
	}
	
	public void pop() {
		if(isEmpty())
			throw new RuntimeException("Stack empty");
		top--;
	}
	
	public int peek() {
		if(isEmpty())
			throw new RuntimeException("Stack empty");
		return arr[top];
	}
	
}



public class Program {

	public static void main(String[] args) {
		Stack s =new Stack(6);
		int choice,value;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("0.EXIT");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PEEK");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1 :
				try {
					System.out.println("Value : ");
					value=sc.nextInt();
					s.push(value);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2 :
				try {
					value=s.peek();
					s.pop();
					System.out.println("Removed : "+value);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			
			case 3 :
				try {
					value=s.peek();
					System.out.println("At top : "+value);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			
			}
		}while(choice!=0);

	}

}
