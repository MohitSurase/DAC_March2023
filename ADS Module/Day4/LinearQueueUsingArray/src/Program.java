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
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public boolean isFull() {
		return rear==arr.length-1;
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
		LinearQueue que=new LinearQueue(6);

		int choice,value;
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
					que.push(value);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2 :
				try {
					value=que.peek();
					que.pop();
					System.out.print("Removed element  : "+value);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 3 :
				try {
					value=que.peek();
					System.out.println("Element at top : "+value);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				break;
			}
		} while (choice != 0);
	}

}
