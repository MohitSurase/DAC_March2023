import java.util.Scanner;

class CircularQueue{
	private int[] arr;
	private int front;
	private int rear;
	
	public CircularQueue(int size) {
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isFull() {
		return (front==-1 && rear==arr.length-1) ||
				( front==rear && front!=-1);
	}
	
	public boolean isEmpty() {
		return (front==rear && front==-1);
	}
	
	public void push(int value) {
		if(isFull())
			throw new RuntimeException("Queue is full");
		rear=(rear+1)%arr.length;
		arr[rear]=value;
	}
	
	public void pop() {
		if(isEmpty())
			throw new RuntimeException("Queue is empty");
		front=(front+1)%arr.length;
		if(front==rear) {
			front=-1;
			rear=-1;
		}
	}
	
	public int peek() {
		if(isEmpty())
			throw new RuntimeException("Queue is empty");
		int index=front+1;
		return arr[index];
	}
}



public class Program {

	public static void main(String[] args) {
		int choice, value;
		Scanner sc=new Scanner(System.in);
		CircularQueue que=new CircularQueue(6);
		
		do {
			System.out.println("0.EXIT");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PEEK");
			System.out.print("Choice : ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				try {
					System.out.print("Enter element : ");
					value=sc.nextInt();
					que.push(value);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 2:
				try {
					value=que.peek();
					que.pop();
					System.out.println("Removed element : "+value);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					value=que.peek();
					System.out.println("Element at front : "+value);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			default: System.out.println("Enter choice between 1-3");
			}
		}while(choice!=0);

	}

}
