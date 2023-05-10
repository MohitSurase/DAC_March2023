
import java.util.Scanner;

class CircularQueue {
	private int[] arr;
	private int front;
	private int rear;

	public CircularQueue(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
	}

	public boolean isFull() {
		return (front==-1 && rear==arr.length-1) ||
				(front==rear && front!=-1);
	}

	public boolean isEmpty() {
		return (front == rear && front==-1);
	}

	public void push(int value) {
		if (isFull())
			throw new RuntimeException("Queue is full");
		rear=(rear+1)%arr.length;
		arr[rear] = value;
	}

	public void pop() {
		if (isEmpty())
			throw new RuntimeException("Queue is empty");
		front=(front+1)%arr.length;
		if(front==rear) {
			front=-1;
			rear=-1;
		}
	}

	public int peek() {
		if (isEmpty())
			throw new RuntimeException("Queue is empty");
		int index=(front+1)%arr.length;
		return arr[index];
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				break;
			System.out.print(arr[i]+" ");
			System.out.println();
		}
	}
}

public class Program {

	public static void main(String[] args) {
		int choice, value;
		CircularQueue q = new CircularQueue(6);
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0.EXIT");
			System.out.println("1.PUSH");
			System.out.println("2.PEEK");
			System.out.println("3.POP");
			System.out.println("4.DISPLAY");
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
			case 4 : q.display();
			break;
			}
		} while (choice != 0);

	}

}
