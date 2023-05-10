import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class BST {

	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
			right = null;
			left = null;
		}

		public int getData() {
			return data;
		}

	}

	private Node root;

	public BST() {
		root = null;
	}

	public void add(int value) {
		Node newNode = new Node(value);
		if (root == null)
			root = newNode;
		else {
			Node trav = root;
			while (true) {
				if (value < trav.data) {
					if (trav.left != null)
						trav = trav.left;
					else {
						trav.left = newNode;
						break;
					}
				} else { // if(value>=trav.data)
					if (trav.right != null)
						trav = trav.right;
					else {
						trav.right = newNode;
						break;
					}
				}
			}
		}
	}

	public void inOrder(Node trav) {
		if (trav == null)
			return;
		inOrder(trav.left);
		System.out.print(trav.data + " ");
		inOrder(trav.right);
	}

	public void inOrder() {
		System.out.println("Inorder : ");
		inOrder(root);
		System.out.println();
	}

	public void preOrder(Node trav) {
		if (trav == null)
			return;
		System.out.print(trav.data + " ");
		preOrder(trav.left);
		preOrder(trav.right);
	}

	public void preOrder() {
		System.out.println("Preorder : ");
		preOrder(root);
		System.out.println();
	}

	public void postOrder(Node trav) {
		if (trav == null)
			return;
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(trav.data + " ");
	}

	public void postOrder() {
		System.out.println("Postorder : ");
		postOrder(root);
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
		int height = height(root);
		return height;
	}

	public Node BFS(int value) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			Node trav = q.poll();
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
		Stack<Node> s = new Stack<>();
		s.push(root);
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
}

public class Program {
	public static void main(String[] args) {
		BST tree = new BST();
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

		tree.inOrder();
		tree.preOrder();
		tree.postOrder();

		int height = tree.height();
		System.out.println("\nHeight of the tree : " + height);

		System.out.println("Enter element to find : ");
		int value = sc.nextInt();

		BST.Node temp = tree.BFS(value);
		if (temp == null)
			System.out.println("BFS : Element not found in BST");
		else
			System.out.println(temp.getData() + " found in BST using BFS");

		BST.Node tmp = tree.DFS(value);
		if (tmp == null)
			System.out.println("DFS : Element not found in BST");
		else
			System.out.println(temp.getData() + " found in BST using DFS");

		// Binary Search to search element in tree
		BST.Node tmp2 = tree.binarySearch(value);
		if (tmp2 == null)
			System.out.println("BinarySearch : Element not found in BST");
		else
			System.out.println(tmp2.getData() + " found in BST using BinarySearch");
	}

}
