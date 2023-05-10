import java.util.Scanner;

class binaryTree {
	private Node root;

	static class Node {
		private int data;
		private Node left, right;

		public Node(int val) {
			data = val;
			left = null;
			right = null;
		}

		public int getData() {
			return data;
		}

	}

	public binaryTree() {
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
		System.out.println("IN : ");
		inorder(root);
		System.out.println();
	}

	public void preorder(Node trav) {
		if (trav == null)
			return;
		System.out.print(trav.data + " ");
		preorder(trav.left);
		preorder(trav.right);
	}

	public void preorder() {
		System.out.println("PRE : ");
		preorder(root);
		System.out.println();
	}

	public void postorder(Node trav) {
		if (trav == null)
			return;
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(trav.data + " ");
	}

	public void postorder() {
		System.out.println("POST : ");
		postorder(root);
		System.out.println();
	}

	public int height(Node trav) {
		if (trav == null)
			return -1;
		int hl = height(trav.left);
		int hr = height(trav.right);
		int max = hl > hr ? hl : hr;
		return max + 1;

	}

	public int height() {
		int h = height(root);
		return h;
	}

	public Node binarySearch(int value) {
		Node trav = root;
		while (trav != null) {
			if (value == trav.data) {
				return trav;
			}
			if (value < trav.data) {
				trav = trav.left;
			} else {
				trav = trav.right;
			}
		}

		return null;
	}

	public Node[] binarySearchWithParent(int value) {
		Node trav = root, parent = null;
		while (trav != null) {
			if (value == trav.data) {
				return new Node[] { trav, parent };
			}
			parent = trav;
			if (value < trav.data) {
				trav = trav.left;
			} else {
				trav = trav.right;
			}
		}

		return new Node[] { null, null };
	}

	public void delete(int value) {
		Node[] arr = binarySearchWithParent(value);
		Node trav = arr[0];
		Node parent = arr[1];
		
		
		if (trav ==null) {
			System.out.println("Node does not exists");
			return;
		}
		if (trav.left != null && trav.right != null) {
			parent = trav;
			Node succ = trav.right;
			while (succ.left != null) {
				parent=succ;
				succ = succ.left;
			}
			trav.data=succ.data;
			trav=succ;
		}
		
		if(trav.right==null) {
			if(trav==root) {
				root=trav.left;
			}
			else if(trav==parent.left) {
				parent.left=trav.left;
			}
			else{
				parent.right=trav.left;
			}
		}
		
		if(trav.left==null) {
			if(trav==root) {
				root=trav.right;
			}
			else if(trav==parent.left) {
				parent.left=trav.right;
			}
			else {
				parent.right=trav.right;
			}
		}
	}
}

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		binaryTree tree = new binaryTree();
		tree.add(50);
		tree.add(30);
		tree.add(10);
		tree.add(90);
		tree.add(100);
		tree.add(40);
		tree.add(70);
		tree.add(80);
		tree.add(60);
		tree.add(20);

		tree.preorder();
		tree.inorder();
		tree.postorder();

		int height = tree.height();
		System.out.println("Height of tree is : " + height);
		System.out.println("Value to search : ");
		int value = sc.nextInt();
		binaryTree.Node src = tree.binarySearch(value);
		if (src == null) {
			System.out.println("Not found");
		} else {
			System.out.println("Found");
		}

		binaryTree.Node[] arr = tree.binarySearchWithParent(value);
		if (arr[0] == null) {
			System.out.println("Not found");
		} else if (arr[1] == null) {
			System.out.println("Found root node");
		} else if (arr[0] != null && arr[1] != null) {
			System.out.println("Node " + arr[0].getData() + " found with parent " + arr[1].getData());
		}
		
		System.out.println("Value to delete : ");
		int del = sc.nextInt();
		tree.delete(del);
		tree.inorder();
	}
}
