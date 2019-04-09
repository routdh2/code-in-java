package org.dhananjay.programming;

import java.util.ArrayList;
class Node {
	int data, index;
	Node left, right;
	Node(int data) {
		this.data = data;
		this.index = 0;
		left=right=null;
	}
	void setIndex(int index) {
		this.index = index;
	}
	int getIndex() {
		return index;
	}
}
public class VerticalSumTree {
	static Node root;
	static ArrayList<Node> nodes = new ArrayList<Node>();
	public static void main(String[] args) {
		root = new Node(5);
		root.left = new Node(6);
		root.right = new Node(7);
		root.left.left = new Node(8);
		root.left.right = new Node(9);
		root.right.left = new Node(10);
		root.right.right = new Node(11);
//		traverseAndSet(root);
		levelOrder(root);
		inOrder(root);
//		queue.forEach((item) -> System.out.println(item.data + " "+ item.index)); 
//		for(int i=0;i<queue.size();i++) {
//			Node node = queue.get(i);
//			System.out.println(node.data + " " + node.index);
//		}
	}
	
	public static void inOrder(Node root) {
		if(root==null)
			return;
		inOrder(root.left);
		System.out.println(root.data + " "+ root.index);
		inOrder(root.right);
	}
	
//	public static void traverseAndSet(Node root) {
//		if(root==null)
//			return;
//		else {
//			nodes.add(root);
//			if(root.left != null) {
//				root.setIndex(root.getIndex()-1);
//				traverseAndSet(root.left);
//			}
//			if(root.right != null) {
//				root.setIndex(root.getIndex()+1);
//				traverseAndSet(root.right);
//			}
//		}
//	}
	
	public static void levelOrder(Node root) {
		ArrayList<Node> queue = new ArrayList<Node>();
		if(root == null)
			return;
		else {
			queue.add(root);
			while(!queue.isEmpty()) {
				Node node = queue.remove(0);
				if(node.left!=null) {
					node.left.setIndex(node.getIndex()-1);
					queue.add(node.left);
				}
				if(node.right!=null) {
					node.right.setIndex(node.getIndex()+1);
					queue.add(node.right);
				}
			}
		}
	}

}
