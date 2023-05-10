
class bst {
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

	public bst() {
		root = null;
	}

	public void add(int value) {
		Node newNode = new Node(value);

		if (root == null) {
			root = newNode;
			return;
		}
		Node trav = root;
		while (true) {
			if (value < trav.data) {
				if (trav.left != null) {
					trav = trav.left;
				} else {
					trav.left = newNode;
					break;
				}

			} else {
				if (trav.right != null) {
					trav = trav.right;
				} else {
					trav.right = newNode;
					break;
				}
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
		bst tree = new bst();

		tree.add(0);
		tree.add(10);
		tree.add(20);
		tree.add(30);
		tree.add(40);
		
		tree.add(50);
		
//		tree.add(8);
//		tree.add(3);
//		tree.add(10);
//		tree.add(1);
//		tree.add(6);
//		tree.add(14);
//		tree.add(4);
//		tree.add(7);
//		tree.add(13);
		tree.inorder();
		boolean ans = tree.checkBST();
		
		if(ans==true)
			System.out.println("Tree is built");
		else
			System.out.println("Not built");
	}

}
