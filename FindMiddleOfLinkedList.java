package org.dhananjay.programming;

import java.io.*;

class Node {
	int data;
	Node next;
	Node(int data) {
		this.data=data;
		this.next=null;
	}
}

class LinkedList {
	Node head;
	public Node insert(Node new_node) {
		if(head==null) {
			head=new_node;
			return head;
		}
		else {
			Node temp = head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=new_node;
		}
		return head;
	}
	
	public void display() {
		if(head==null) {
			System.out.println("No items to display.");
			return;
		}
		else {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+ " ");
				temp=temp.next;
			}
		}
			
		
	}
}
public class FindMiddleOfLinkedList {
	public static void main(String args[]) throws IOException{
		LinkedList list = new LinkedList();
		list.insert(new Node(1));
		list.insert(new Node(2));
		list.insert(new Node(3));
		list.display();
	}

}
