import java.util.Scanner;

class DoublyLinearLL {

	static class Node {
		// NODE class Fields
		private int data;
		private Node next;
		private Node prev;

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

	// DoublyLinearLL class Fields
	private Node head;

	// DoublyLinearLL class Methods
	public DoublyLinearLL() {
		head = null;
	}

	void displayForward() {
		System.out.println("Forward list:");
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node trav = head;

		while (trav != null) { // traverse till last node
			System.out.println(trav.data); // print data in nodes until the trav node point to null
			trav = trav.next;
		}
	}

	void displayReverse() {
		System.out.println("Reverse list:");
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node trav = head;
		// traverse till last node to get the trav pointer to point to last node
		while (trav.next != null) {
			trav = trav.next;
		}
		// start traversing in reverse direction using prev pointer
		while (trav != null) { // traverse till first node
			System.out.println(trav.data); // print data in nodes until the trav node point to null
			trav = trav.prev;
		}
	}

	void addLast(int value) {
		// create new Node and initialize it
		Node newNode = new Node(value);
		// special case if list is empty
		if (head == null) {
			head = newNode;
		} else {
			// traverse till the last node
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next; // trav will be lastNode, trav.next is pointing to null
			}
			trav.next = newNode; // After adding newNode at last pos, trav's next pointer should point to newNode
			newNode.prev = trav; // Also newNode prev pointer should point to trav
		}
	}

	void addFirst(int value) {
		if (head == null) { // special case 1: if list is empty
			addLast(value);
		} else {
			// create new node and initialize it
			Node newNode = new Node(value);

			// newNode will be added to 1st position so newNode next should point to current
			// head
			newNode.next = head;

			// current head's prev should point to newNode
			head.prev = newNode;

			// After that, as newNode is 1st node, so head should point to newNode
			head = newNode;
		}
	}

	void addAtPosition(int value, int position) {
		//special case : if list is empty or position is 1
		if(head==null || position <= 1) {
			addFirst(value);
			return;
		}
		// create new node and initialize it
		Node newNode = new Node(value);

		Node trav = head, temp = null;
		// traverse till position-1 using trav
		for (int i = 1; i < position - 1; i++) {
			if(trav.next==null) {  //if position is out of list size, 
				System.out.println("Invalid position entered");
				return;
			}
			trav = trav.next; // here, trav will be position-1 node
		}
		temp = trav.next; // temp will point to current node at position

		newNode.next = temp; // NewNode's next should point to temp node which is at position
		newNode.prev = trav; // newNode's prev should point to trav which is at position-1

		trav.next = newNode; // Node at position-1 next should point to newNode which is at position

		if (temp != null) // if position entered is last, trav will point to last node and so temp will
							// point to null
			temp.prev = newNode; // if position entered is not last then only temp's prev should point to newNode
	}

	void delFirst() {
		// special case 1 : if list is empty
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		// special case 2 : if list has only one element
		if (head.next == null) {
			head = null;
			return;
		}
		// general case : delete first element in list
		head = head.next; // head should now point to 2nd node
		head.prev = null; // 2nd node prev should not point to 1st node, instead it should point to null
	}

	void delLast() {
		// special case 1: if list is empty
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		// general case : delete last element
		Node trav = head;
		while (trav.next != null) { // traverse till last node
			trav = trav.next; // here we will get trav as last node
		}
		trav.prev.next = null; // trav's prev node i.e. 2nd last node's next should now point to null instead
								// of last node i.e.trav
	} // trav will be garbage collected

	void delAtPosition(int position) {
		//special case 1: if position entered by user is 1
		if (position == 1) {
			delFirst();
			return;
		}
		//special case 2 : if list is empty or invalid position is entered
		if (head == null || position < 1) {
			throw new RuntimeException("List is empty");
		}
		//general case : if we have to delete node at specific position
		Node trav=head;
		for(int i=1;i<position;i++) {
			trav=trav.next;   //trav will be node at position
		}
		trav.prev.next=trav.next;  //Previous node of trav should now point to next node of trav
							//if position entered by user is last position in the linked list			
		if(trav.next!=null)  //if we are deleting node at last position, then we can ignore next statement
			trav.next.prev=trav.prev;   //Next node of trav's prev should point to trav's previous node
	}
	
	void delAll() {
		head=null;
	}
}

public class Program {

	public static void main(String[] args) {
		int choice, value, position;
		Scanner sc = new Scanner(System.in);
		DoublyLinearLL list = new DoublyLinearLL();
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
