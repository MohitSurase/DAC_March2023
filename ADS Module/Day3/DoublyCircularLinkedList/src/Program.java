import java.util.Scanner;

class DoublyCircularLL {

	static class Node {
		// Node class fields
		private int data;
		private Node next;
		private Node prev;

		// Node class methods
		public Node() {
			data = 0;
			next = null;
			prev = null;
		}

		public Node(int value) {
			data = value;
			next = null;
			prev = null;
		}
	}

	// DoublyCircularLL class fields
	private Node head;

	// DoublyCircularLL class methods
	public DoublyCircularLL() {
		head = null;
	}

	// function to check if list is empty or not
	boolean isEmpty() {
		return head == null;
	}

	void displayForward() {
		System.out.println("Forward list : ");
		// special case 1: if list is empty
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		// traverse till last node
		Node trav = head;
		do {
			System.out.println(trav.data);
			trav = trav.next; // prints all nodes till last node, after printing last node trav will become
								// head again
		} while (trav != head); // after trav=head, loop will stop its execution
	}

	void displayReverse() {
		System.out.println("Reverse list : ");
		// special case 1 : if list is empty
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		// Traversing to last node as it is Circular type LL
		Node tail = head.prev;

		// traverse till first node
		do {
			System.out.println(tail.data);
			tail = tail.prev; // prints all nodes till 1st node, after printing 1st node tail will become
								// head.prev again
		} while (tail != head.prev);
	}

	void addLast(int value) {
		// create New Node and initialize
		Node newNode = new Node(value);

		// special case:1 if list is empty
		if (isEmpty()) {
			newNode.next = newNode;
			newNode.prev = newNode;
			head = newNode;
			return;
		}

		Node tail = head.prev; // tail will point to last node in DCLL

		// make newNode connections before breaking previous connections
		newNode.prev = tail; // after adding newNode as last node, tail will become 2nd last node. Hence
								// newNode prev should point to tail
		newNode.next = head; // as NN is last node, NN's next should point to 1st node i.e head

		// Break previous connections and then make newNode as last node in DCLL
		tail.next = newNode; // 2nd last node's next should point to NN, as NN is now last node
		head.prev = newNode; // head's prev should point to last node i.e. NewNode

	}

	void addFirst(int value) {
		// Create new node and initialize
		Node newNode = new Node(value);
		// special case 1 : if list is empty
		if (isEmpty()) {
			newNode.next = newNode;
			newNode.prev = newNode;
			head = newNode;
			return;
		}

		Node tail = head.prev; // tail is last node in linked list

		// Make newNode connection //we have to add newNode at 1st position
		newNode.next = head; // so current head will become 2nd node, NN's next should point to 2nd node i.e.
								// head
		newNode.prev = tail; // also, NN's prev should point to last node i.e. tail

		// Break previous connections
		head.prev = newNode; // head is now 2nd node, its prev should point to 1st node i.e newNode
		tail.next = newNode; // last node's next(tail's next) should point to first node i.e.newNode

		head = newNode; // newNode is 1st node, so head should point to newNode

	}

	void addAtPosition(int value, int position) {
		// special case 1 : if position entered is 1 or list is empty
		if (head == null || position <= 1) {
			addFirst(value);
			return;
		}
		// Create new node and initialize
		Node newNode = new Node(value);
		Node trav = head, temp = null;

		for (int i = 1; i < position - 1; i++) {
			if (trav.next == head) {
				System.out.println("Invalid position");
				return;
			} 
				trav = trav.next;   //trav is node at position-1
 			
		}
		temp = trav.next;  		//temp is node at position
		
		//make newNode connections before breaking previous connections
		newNode.next = temp;	//newNode's next should point to node at position
		newNode.prev = trav;	//newNode's prev should point to node at position-1
		
		//Break previous connections before making new connection
		trav.next = newNode;	//node at position-1 i.e trav's next should point to newNode
		temp.prev = newNode;	//node at position i.e. temp's prev should point to newNode
	}
	
	void delFirst() {
		//special case 1 : if list is empty 
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		//special case 2 : if list contains only one element
		if(head.next==head) {
			head=null;
			return;
		}
		//general case : delete element at 1st position
		Node tail=head.prev;   //tail is last node in linked list
		
		head=head.next;		//head should point to 2nd node as we have to delete node at first position
		
		head.prev=tail;		//2nd node is now head node, 2nd node should point to last node now as we have to delete 1st node
		tail.next=head;		//last node should point to head i.e.2nd node as 1st node is deleted
	}
	
	
	void delAtPosition(int position) {
		//special case 1 : if list is empty 
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		//special case 2 : if position entered by user is 1
		if(position==1) {   
			delFirst();
		}
		Node trav=head;  
		
		//traverse till position
		for(int i=1;i<position;i++) {
			trav=trav.next;      //trav is the node to be deleted      
		}
		
		trav.next.prev=trav.prev;  //Next node of trav should point to previous node of trav, as trav is to be deleted
		trav.prev.next=trav.next; //Previous node of trav should point to next node of trav, as trav is to be deleted
	}
	
	void delLast() {
		//special case 1 : if list is empty
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		//special case 2 : if list has only 1 node
		if(head.next==head) {
			head=null;
			return;
		}
		
		Node tail=head.prev;   //tail is last node which is to be deleted
		
		tail.prev.next=head;   //tail's previous node should point to head
		head.prev=tail.prev;	//head's previous should point to 2nd last node
	}
	
	void delAll() {
		/* This code is okay as well but we need to go for 
		 * safer option to reduce JVM workload
		 * 
		 * head = null;
		 */
		
		head.next=null;
		head=null;
	}
}

public class Program {

	public static void main(String[] args) {
		int choice, value, position;
		Scanner sc = new Scanner(System.in);
		DoublyCircularLL list = new DoublyCircularLL();
		do {

			System.out.println();
			System.out.println("0.EXIT");
			System.out.println("1.Display");
			System.out.println("2.Add First");
			System.out.println("3.Add Last");
			System.out.println("4.Add at Position");
			System.out.println("5.Delete First");
			System.out.println("6.Delete Last");
			System.out.println("7.Delete at Position");
			System.out.println("8.Delete All");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				list.displayForward();
				System.out.println();
				list.displayReverse();
				break;
			case 2:
				System.out.println("Enter new element : ");
				value = sc.nextInt();
				list.addFirst(value);
				break;
			case 3:
				System.out.println("Enter new element : ");
				value = sc.nextInt();
				list.addLast(value);
				break;
			case 4:
				System.out.println("Enter new element : ");
				value = sc.nextInt();
				System.out.println("Enter position : ");
				position = sc.nextInt();
				list.addAtPosition(value, position);
				break;
			case 5:
				list.delFirst();
				break;
			case 6:
				list.delLast();
				break;
			case 7:
				System.out.println("Enter position : ");
				position = sc.nextInt();
				try {
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
