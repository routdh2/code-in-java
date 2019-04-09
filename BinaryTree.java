//package org.dhananjay.programming;
//
//import java.util.ArrayList;
//class Node {
//	int data;
//	Node left,right;
//	Node(int data) {
//		this.data = data;
//		left=right=null;
//	}
//}
//public class BinaryTree {
//	static Node root;
//	static ArrayList<Integer> arr = new ArrayList<Integer>();
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		root = new Node(5);
//		root.left = new Node(6);
//		root.right = new Node(7);
//		root.left.left = new Node(8);
//		root.left.right = new Node(9);
//		root.right.left = new Node(10);
//		root.right.right = new Node(11);
////		inOrderTraversal(root);
////		arr.forEach((item) -> System.out.print(item + " ")); 
//		levelOrderTraversal(root);
//	}
//	
//	public static void inOrderTraversal(Node root) {
//		if(root==null)
//			return;
//		inOrderTraversal(root.left);
//		arr.add(root.data);
//		inOrderTraversal(root.right);
//	}
//	
//	public static void levelOrderTraversal(Node root) {
//		ArrayList<Node> queue = new ArrayList<Node>();
//		if(root==null)
//			return;
//		else {
////			System.out.print(root.data);
//			queue.add(root);
//			while(!queue.isEmpty()) {
//				Node node = queue.remove(0);
//				if(node.left != null) {
//					queue.add(node.left);
//				}
//				if(node.right != null) {
//					queue.add(node.right);
//				}
//				System.out.print(node.data + " ");
//			}
//		}
//	}
//
//}
