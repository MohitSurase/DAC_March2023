import java.util.Scanner;

class LinearQueue{
	private int[] arr;
	private int front;
	private int rear;
	
	public LinearQueue(int size) {
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isFull() {
		return rear==arr.length-1;
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	public void push(int value) {
		if(isFull())
			throw new RuntimeException("Queue is full");
		rear++;
		arr[rear]=value;
	}
	
	public void pop() {
		if(isEmpty())
			throw new RuntimeException("Queue is empty");
		front++;
	}
	
	public int peek() {
		if(isEmpty())
			throw new RuntimeException("Queue is empty");
		return arr[front+1];
	}
}

public class Program {

	public static void main(String[] args) {
		int choice, value;
		LinearQueue q=new LinearQueue(6);
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0.EXIT");
			System.out.println("1.PUSH");
			System.out.println("2.PEEK");
			System.out.println("3.POP");
			System.out.print("Choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				try {
					System.out.println("Enter element to add : ");
					value = sc.nextInt();
					q.push(value);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					int elem = q.peek();
					System.out.println("Element at top : " + elem);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					int elem = q.peek();
					q.pop();
					System.out.println("Element removed is : " + elem);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
		} while (choice != 0);

	}

}
