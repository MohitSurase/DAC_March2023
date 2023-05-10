import java.util.Stack;

class Linklist{
	static class Node{
		private char data;
		private Node next;
		
		public Node(char value) {
			data=value;
			next=null;
		}
	}
	private Node head;
	
	public Linklist() {
		head=null;
	}
	
	public void addFirst(char data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	public void display() {
		if(head==null) {
			System.out.println("List is empty");
			return;	
		}
		Node trav=head;
		while(trav!=null) {
			System.out.print(trav.data+" -> ");
			trav=trav.next;
		}
		System.out.print("null");
	}
	
	public boolean palindrome() {
		Stack<Character> s=new Stack<>();
		Node trav=head;
		while(trav!=null) {
			s.push(trav.data);
			trav=trav.next;
		}
		Node t=head;
		while(!s.isEmpty()) {
			char check=s.pop();
			
			if(check==t.data) {
				t=t.next;
				continue;
				
			}
			else {
				return false;
			}
		}
		return true;
	}
}

public class Program {

	public static void main(String[] args) {
		Linklist list=new Linklist();

		list.addFirst('A');
		list.addFirst('A');
		list.addFirst('A');
		list.addFirst('A');
		list.addFirst('A');
		
		list.display();
		
		boolean flag = list.palindrome();
		if(flag==true)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
