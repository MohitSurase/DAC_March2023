import java.util.Scanner;

class SinglyCircularLL {

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

	public SinglyCircularLL() {
		head = null;
	}

	// Function to check if list is empty
	public boolean isEmpty() {
		return head == null;
	}

	void display() {
		// We can write this function as well
		/*
		 * if(head==null) { System.out.println("List is empty"); return; }
		 */

		// Substitute for above code
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		Node trav = head;
		do {
			System.out.println(trav.data);
			trav = trav.next;
		} while (trav != head); // prints all nodes, till last node
	}

	void addLast(int value) {
		// Create new node &initialize
		Node newNode = new Node(value);
		Node trav = head;
		// special case: if list is empty
		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
		} else {
			// Traverse till last Node
			while (trav.next != head) {
				trav = trav.next;
			}

			newNode.next = head; // after creating node at end, newNode should contain pointer to head
			trav.next = newNode; // trav will become 2nd last node and it should contain pointer to lastNode
		} // i.e. in this case newNode
	}

	void addFirst(int value) {
		// Create new node &initialize
		Node newNode = new Node(value);
		Node trav = head;

		// Special case : if list is empty
		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
		}

		else {
			// traverse till lastNode
			while (trav.next != head) {
				trav = trav.next;
			}
			newNode.next = head; // New node is added to 1st position. So, NewNodes next should point to current
									// head
			trav.next = newNode; // trav which is lastNode, should now point to newNode as newNode will become
									// first node
			head = newNode; // After adding at 1st position, head should now contain newNode address
		}
	}  

	void addAtPosition(int value, int position) {
		// special case 1 : if position entered is 1 or list is empty
		if (head == null || position <= 1)
			addFirst(value);
		else {
			// create new node and initialize it
			Node newNode = new Node(value);
			Node trav = head;
			for (int i = 1; i < position - 1; i++) { // traverse till position-1
				trav = trav.next; // here trav will store Node at position-1
			}
			newNode.next = trav.next; // New node should point to node at position+1
			trav.next = newNode; // after adding new Node, trav should now point to newNode
		}
	}

	void delFirst() {
		Node trav = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		if (head.next == head) {
			head = null;
			return;
		}
		while (trav.next != head) { // traverse till lastNode
			trav = trav.next;
		}
		head = head.next; // as we are deleting 1st node, head should point to 2nd node
		trav.next = head; // now last node should point to head node

	}

	void delLast() {
		if (head == null) {
			throw new RuntimeException("List is empty");
		}
		if (head.next == head) {
			head = null;
		} else {
			// take 2 pointers
			Node temp = null, trav = head;

			while (trav.next != head) {  // traverse till last node
				temp = trav; 			 // temp will contain 2nd last node
				trav = trav.next; 		 // trav will contain last node, which is to be deleted
			}
			temp.next = head; 			 // now 2nd last node should point to head
		}
	}
	
	void delAtPosition(int position) {
		//special case 1: if user enters position as 1 
		if(position==1)
			delFirst();
		//special case 2: if list is empty or invalid position is entered
		if(head==null || position<1)
			throw new RuntimeException("List is empty or Invalid Position");
		//take 2 pointers
		Node temp=null, trav=head;
		for(int i=1;i<position;i++) {  //traverse till node to be deleted
			//special case 3: If entered position is out of list size
			if(trav.next==head)
  				throw new RuntimeException("Invalid Position");
			temp=trav;					//temp will contain position-1 node
			trav=trav.next;				//trav is the node to be deleted
		}					
		temp.next=trav.next; 			//temp should point to position+1 node
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
		SinglyCircularLL list = new SinglyCircularLL();
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
				list.display();
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
			case 7:System.out.println("Enter position : ");
			position = sc.nextInt();
				list.delAtPosition(position);
				break;
			case 8: 
				list.delAll();
				break;
			}
		} while (choice != 0);
	}
}
