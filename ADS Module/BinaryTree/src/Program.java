import java.util.LinkedList;
import java.util.Queue;

class binarytree {
	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
	}

	private Node root;

	public binarytree() {
		root = null;
	}

	public void add(int value) {
		Node newNode=new Node(value);
		if(root==null) {
			root=newNode;
			return;
		}
		
		Queue<Node> queue=new LinkedList<>();
		queue.offer(root);
		
		 while (!queue.isEmpty()) {
	            Node trav = queue.poll();

	            if (trav.left == null) {
	                trav.left = newNode;
	                return;
	            } else {
	                queue.offer(trav.left);
	            }

	            if (trav.right == null) {
	                trav.right = newNode;
	                return;
	            } else {
	                queue.offer(trav.right);
	            }
	        }
		
	}

	public void inorder(Node trav) {
		if (trav == null) 
			return;
		inorder(trav.left);
		System.out.print(trav.data + " ");
		inorder(trav.right);
	}

	public void inorder() {
		inorder(root);
	}
	
	public boolean checkBST(Node trav, int min, int max) {
		if(trav==null) {
			return true;
		}
		 return (min<trav.data) && (trav.data<max)&& 
		            checkBST(trav.left,min,trav.data) &&
		            checkBST(trav.right,trav.data,max);
	}
	
	public boolean checkBST() {
		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
}



public class Program {

	public static void main(String[] args) {
		binarytree tree=new binarytree();
//		tree.add(1);
//		tree.add(2);
//		tree.add(3);
//		tree.add(4);
//		tree.add(5);
//		tree.add(6);
//		tree.add(7);
//		tree.add(8);
//		tree.add(9);
//		tree.add(10);
//		tree.add(11);
//		tree.add(12);
		
		tree.add(2);
		tree.add(1);
		tree.add(3);
		
		tree.inorder();
		boolean flag = tree.checkBST();
		if(flag)
			System.out.println("BST");
		else
			System.out.println("No BST");
	}

}
