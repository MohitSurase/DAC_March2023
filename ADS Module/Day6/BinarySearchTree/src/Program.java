import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import javax.management.RuntimeErrorException;

class BinarySearchTree {
	static class Node {
		// node class fields
		private int data;
		private Node left;
		private Node right;

		// node class methods
		public Node() {
			data = 0;
			left = null;
			right = null;
		}

		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}

		public int getData() {
			return data;
		}

	}

	// BinarySearchTree class fields
	private Node root;

	// BinarySearchTree class methods
	public BinarySearchTree() {
		root = null;
	}

	public void add(int value) {
		Node newNode = new Node(value);

		if (root == null) // If root is null, make newNode as root of the tree
			root = newNode;
		else {
			Node trav = root;
			while (true) {
				if (value < trav.data) { // if value is less than trav value, then go to left part of tree
					if (trav.left != null)
						trav = trav.left;
					else { // there is no left child node of current node
						trav.left = newNode;
						break;
					}
				} else { // if(value>=trav.data) //if value is greater than or equal to trav value, then
							// go to right part of tree
					if (trav.right != null)
						trav = trav.right;
					else { // there is no right child node of current node
						trav.right = newNode;
						break;
					}
				}
			}
		}
	}

	public int height(Node trav) {
		if (trav == null) // if tree is empty or null, return height as -1
			return -1;
		int hl = height(trav.left); // calculate height of left child node
		int hr = height(trav.right); // calculate height of right child node
		int max = hl > hr ? hl : hr; // check for maximum height in both child nodes
		return max + 1; // return parent height = max child height+1
	}

	public int height() {
		int max = height(root);
		return max;

	}

	public void preorder(Node trav) { // print tree in Root Left Right manner
		if (trav == null)
			return;
		System.out.print(trav.data + " "); // print root
		preorder(trav.left);
		preorder(trav.right);
	}

	public void preorder() {
		System.out.print("Preorder traversal : ");
		preorder(root);
		System.out.println();
	}

	public void inorder(Node trav) { // print tree in Left Root Right manner
		if (trav == null)
			return;
		inorder(trav.left);
		System.out.print(trav.data + " ");
		inorder(trav.right);
	}

	public void inorder() {
		System.out.print("Inorder traversal : ");
		inorder(root);
		System.out.println("");
	}

	public void postorder(Node trav) { // print tree in Left Right Root manner
		if (trav == null)
			return;
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(trav.data + " ");
	}

	public void postorder() {
		System.out.print("Postorder traversal : ");
		postorder(root);
		System.out.println("");
	}

	public void deleteAll(Node trav) { // to delete All Nodes in the tree
		if (trav == null)
			return;
		deleteAll(trav.left);
		deleteAll(trav.right);
		trav.left = null;
		trav.right = null;
		trav = null;

	}

	public void deleteAll() {
		/*
		 * indirect way to ask JVM to garbage collect all the nodes
		 * 
		 * root=null;
		 */
		deleteAll(root);
		root = null;
	}

	public Node BFS(int value) {
		Queue<Node> q = new LinkedList<>(); // we use queue in BFS as we have to search level by level
		Node trav = root; // FIFO behavior
		q.offer(trav);
		while (!q.isEmpty()) {
			trav = q.poll();
			if (value == trav.data)
				return trav;
			if (trav.left != null)
				q.offer(trav.left);
			if (trav.right != null)
				q.offer(trav.right);
		}
		return null;
	}

	public Node DFS(int value) {
		Stack<Node> s = new Stack<>(); // we use stack in DFS as we have to search element in depthwise manner
		s.push(root); // LIFO behavior
		while (!s.isEmpty()) {
			Node trav = s.pop();
			if (value == trav.data)
				return trav;
			if (trav.right != null)
				s.push(trav.right);
			if (trav.left != null)
				s.push(trav.left);
		}
		return null;
	}

	// BinarySearch to find element in tree
	public Node binarySearch(int value) {
		Node trav = root;

		while (trav != null) {
			if (value == trav.data)
				return trav;
			if (value < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		return null;
	}

	// BinarySearch to find element with parent in tree
	public Node[] binarySearchWithParent(int value) {
		Node trav = root, parent = null;

		while (trav != null) {
			if (value == trav.data)
				return new Node[] { trav, parent };

			parent = trav;
			if (value < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		return new Node[] { null, null };
	}
	
	public void delete(int value) {
		Node trav, parent;
		
		//find node to be deleted along with its parent
		Node[] arr=binarySearchWithParent(value);
		trav=arr[0];
		parent=arr[1];
		
		//if node with given value is not found throw exception
		if(trav==null)
			throw new RuntimeException("Node not found");
		
		//if node has both left and right child
		if(trav.left!=null && trav.right!=null) {
			parent=trav;
			//find node's successor in order to replace deleted node
			//successor of node is go right of the node once and find leftmost node
			Node succ=trav.right;
			 
			while(succ.left!=null) {
				parent=succ;
				succ=succ.left;
			}
			//overwrite trav's data with successor's data
			trav.data=succ.data;    //now successor is at trav's place
			trav=succ;   			//we need to delete successor from its previous position
		}
		
		//if node has right child only
		if(trav.left==null) {
			if(trav==root)
				root=trav.right;
			else if(trav==parent.left)
				parent.left=trav.right;
			else          //if(trav==parent.right)
				parent.right=trav.right;
		}
		
		//if node has left child only
		if(trav.right==null) {
			if(trav==root)
				root=trav.left;
			else if(trav==parent.left)
				parent.left=trav.left;
			else        //if(trav==parent.right)
				parent.right=trav.left;
		}
		
	}
}

public class Program {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		Scanner sc = new Scanner(System.in);
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
//		int height = tree.height();
//		System.out.println("height : " + height);
//
//		tree.preorder(); // display tree in parent, left, right manner
//		tree.inorder(); // display tree in left, parent, right manner
//		tree.postorder(); // display tree in left, right, parent manner
//
//		System.out.println("Enter element to find : ");
//		int value = sc.nextInt();
//
//		// BFS to search element in tree
//		BinarySearchTree.Node temp = tree.BFS(value);
//		if (temp == null)
//			System.out.println("BFS : Element not found in BST");
//		else
//			System.out.println(temp.getData() + " found in BST using BFS");
//
//		// Binary Search to search element in tree
//		BinarySearchTree.Node tmp = tree.binarySearch(value);
//		if (tmp == null)
//			System.out.println("BinarySearch : Element not found in BST");
//		else
//			System.out.println(tmp.getData() + " found in BST using BinarySearch");
//
//		// DFS to search element in tree
//		BinarySearchTree.Node tmp2 = tree.DFS(value);
//		if (tmp2 == null)
//			System.out.println("DFS : Element not found in BST");
//		else
//			System.out.println(tmp2.getData() + " found in BST using DFS");
//
//		// Binary Search to search element with parent in tree
//		BinarySearchTree.Node[] arr = tree.binarySearchWithParent(value);
//		if (arr[0] == null)
//			System.out.println("Element not found");
//		else if(arr[1]==null)
//			System.out.println(arr[0].getData()+ " found and it is root node");
//		else
//			System.out.println(arr[0].getData()+" found with parent as "+arr[1].getData());

		//if we want to delete any specific node from the tree
		tree.inorder();
		try {
			System.out.println("Enter node to delete : ");
			int delete=sc.nextInt();
			tree.delete(delete);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		tree.inorder();
		
		sc.close(); // closing scanner resource

//		tree.deleteAll();   //to delete all nodes in tree
//		tree.preorder(); 
//		tree.inorder(); 
//		tree.postorder(); 

	}
}
