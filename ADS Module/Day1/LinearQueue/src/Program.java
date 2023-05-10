import java.util.Scanner;

class LinearQueue{
	int arr[];
	int front,rear;
	
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
		if(isFull()) {
			throw new RuntimeException("Queue full");
		}
		else {
			rear++;
		arr[rear]=value;
		}
	}
	
	public void pop() {
		if(isEmpty())
			throw new RuntimeException("Queue empty");
		front++;
	}
	
	public int peek() {
		if(isEmpty())
			throw new RuntimeException("Queue empty");
		return arr[front+1];
	}
	
}



public class Program {

	public static void main(String[] args) {
		LinearQueue q =new LinearQueue(6);
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
					q.push(value);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2 :
				try {
					value=q.peek();
					q.pop();
					System.out.println("Removed : "+value);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			
			case 3 :
				try {
					value=q.peek();
					System.out.println("At top : "+value);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			
			}
		}while(choice!=0);

	}

}
