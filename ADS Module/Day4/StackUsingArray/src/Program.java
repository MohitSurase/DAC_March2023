import java.util.Scanner;

class Stack {
	// Stack class fields
	private int[] arr;
	private int top;

	// Stack class methods
	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}

	// Function to check if stack is empty
	public boolean isEmpty() {
		return top == -1;
	}

	// Function to check if stack is full
	public boolean isFull() {
		return top == arr.length - 1;
	}

	// Function to add an element in stack
	public void push(int value) {
		if (isFull())
			throw new RuntimeException("Stack is full");
		top++;
		arr[top] = value;
	}

	// Function to remove an element from stack
	public void pop() {
		if (isEmpty())
			throw new RuntimeException("Stack is empty");
		top--;
	}

	// Function to return element at top in stack
	public int peek() {
		if (isEmpty())
			throw new RuntimeException("Stack is empty");
		return arr[top];
	}
	
}

public class Program {

	public static void main(String[] args) {
		int choice, value = 0;
		Stack stack = new Stack(5);
		
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println();
			System.out.println("0.EXIT");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PEEK");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				try {
					System.out.print("Enter element to add : ");
					value=sc.nextInt();
					stack.push(value);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2 :
				try {
					value=stack.peek();
					stack.pop();
					System.out.print("Removed element  : "+value);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 3 :
				try {
					value=stack.peek();
					System.out.println("Element at top : "+value);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				break;
			}
		} while (choice != 0);

	}
}