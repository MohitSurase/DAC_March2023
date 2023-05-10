import java.util.Scanner;

class SinglyLinearLL {
	// Node is static class of SinglyLinearLL
	static class Node {
		// Node class fields
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

	// Fields of SinglyLinearLL class
	private Node head;

	// Methods of SinglyLinearLL class
	public SinglyLinearLL() {
		head = null;
	}

	void display() {
		Node trav;
		trav = head;
		System.out.println("List elements : ");
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
	}

	void addLast(int value) {
		// Create new node and initialize it
		Node newNode = new Node(value);

		// Special case: If LL is empty, add newNode as First node in LL
		if (head == null) {
			head = newNode;
		}
		// Otherwise if LL is not empty, follow general procedure
		else {
			// Traverse till last node where node.next==null
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newNode; // add new node after trav, i.e. add new node at trav.next
		}
	}

	void addFirst(int value) {
		// Create new node and initialize it
		Node newNode = new Node(value);

		// New Nodes next should point to current first node i.e. Head of LL
		newNode.next = head;

		// As we are adding element at first position, head should point to newNode
		head = newNode;
	}

	void addAtPosition(int value, int position) {
		// special case-1 : if list is empty i.e head==null
		// special case-2 : if user enters position as 1 to add new node
		if (head == null || position <= 1) {
			addFirst(value); // Call already defined function //DRY principle : Do not repeat yourself
		}

		// Create new node and initialize it
		Node newNode = new Node(value);
		Node trav = head; // head is first node, i=1 will indicate first node

		// Traverse till position-1 to add new node
		for (int i = 1; i < position - 1; i++)
			trav = trav.next;

		// We will arrive at node after which we need to add new node
		newNode.next = trav.next; // First we need to make sure that new nodes next should point to trav's next
		trav.next = newNode; // After adding new node, trav's next should point to newNode
	}

	void delFirst() {
		// Special case: if list is empty
		if (head == null)
			throw new RuntimeException("List is empty");
		// general case, make head point to next node
		head = head.next; // here, the first node will be garbage collected by JVM
	}

	void delAll() {
		head = null; // Note : All available nodes will be garbage collected
	}

	void delAtPosition(int position) {
		//special case-1 : if user enters position as 1
		if(position==1)
			delFirst();
		//special case-1 : if list is empty
		if(head==null || position < 1)
			throw new RuntimeException("List is empty or invalid choice");
		
		// Take 2 pointers temp, trav
		Node temp = null, trav = head;

		// traverse till the position
		for (int i = 1; i < position; i++) {
			//special case 3 : If position is out of Linkedlist scope
			if(trav==null)
				throw new RuntimeException("Invalid choice");
			temp = trav; 		// temp is 1 value behind trav
			trav = trav.next;	//trav is node to be deleted
		}
		temp.next = trav.next; 	//trav node will be garbage collected
	}
}

public class Program {

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

			case 6:
				break;

			case 7:
				System.out.println("Enter the position of element to delete : ");
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
	