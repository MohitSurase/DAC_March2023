import java.util.Scanner;

class SinglyLinearLL {
	static class Node {
		private int data;
		private Node next;

		public Node() {
			data = 0;
			next = null;
		}

		public Node(int value) {
			data = value;
			next = null;
		}
	}

		private Node head;
		public SinglyLinearLL() {
		head = null;
	}
		
		void display() {
			Node trav=head;
			if(head==null)
				System.out.println("List is empty");
			while(trav!=null) {
				System.out.println(trav.data);
				trav=trav.next;
			}
		}
		
		void addFirst(int value) {
			Node newNode=new Node(value);
			newNode.next=head;
			head=newNode;
		}
		
		void addLast(int value) {
			Node newNode=new Node(value);
			Node trav=head;
			while(trav.next!=null)
				trav=trav.next;
			trav.next=newNode;
		}
		
		void addAtPosition(int value, int position) {
			Node newNode=new Node(value);
			Node trav=head;
			
			for(int i=1;i<position-1;i++) {
				trav=trav.next;
			}
			newNode.next=trav.next;
			trav.next=newNode;
		}
		
		void delFirst() {
			head=head.next;
		}
		
		void delAll() {
			head=null;
		}
		
		void delLast() {
			Node trav=head, temp=null;
			
			while(trav.next!=null) {
				temp=trav;
				trav=trav.next;
			}
			temp.next=null;
		}
		void delAtPosition(int position) {
			Node trav=head, temp=null;
			if(position==1)
				delFirst();
			if(head==null && position<1)
				throw new RuntimeException("List Empty or Invalid Choice");
			for(int i=1;i<position;i++) {
				temp=trav;
				trav=trav.next;
			}
			temp.next=trav.next;
		}
}

public class SinglyListMain {

	public static void main(String[] args) {
		int choice, value, position;
		SinglyLinearLL list = new SinglyLinearLL();

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n0.EXIT " + "\n1.Display " + "\n2.Add first " + "\n3.Add Last "
					+ "\n4.Add at position " + "\n5.Delete first" + "\n6.Delete Last" + "\n7.Delete at position"
					+ "\n8.Delete All" + "\nEnter choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: // Display elements
				list.display();
				break;

			case 2: // Add element at first position
				System.out.println("Enter new element : ");
				value = sc.nextInt();
				list.addFirst(value);
				break;

			case 3: // Add element at last position
				System.out.println("Enter new element : ");
				value = sc.nextInt();
				list.addLast(value);
				break;

			case 4:// Add element at specific position
				System.out.println("Enter new element : ");
				value = sc.nextInt();
				System.out.println("Enter element position : ");
				position = sc.nextInt();
				list.addAtPosition(value, position);
				break;

			case 5:
				try {
					list.delFirst();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 6:	list.delLast();
				break;

			case 7:
				try {
					System.out.println("Enter the position of element to delete : ");
					position = sc.nextInt();
					list.delAtPosition(position);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 8:
				list.delAll();
				break;
			}

		} while (choice != 0);

	}

}
