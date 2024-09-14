package com.code.ds;

public class LinkedList {

	static class Node {
		int data;

		Node next;

		public Node(int data) {

			this.data = data;
			this.next = null;
		}
	}

	Node head = null;

	public void insertAtBegin(int data) {

		Node new_node = new Node(data);
		if (head == null) {
			head = new_node;

		} else {
			new_node.next = head;
			head = new_node;
		}
	}

	public void insertAtLast(int data) {
		Node new_node = new Node(data);
		if (head == null) {
			head = new_node;

		} else {
			Node current_node = head;
			while (current_node.next != null) {
				current_node = current_node.next;
			}
			current_node.next = new_node;
		}
	}

	public void insertAtIndex(int data, int index) {
		Node new_node = new Node(data);
		if (head == null) {
			head = new_node;

		} else {
			int position = 0;
			Node current_node = head;
			if (position == index) {
				insertAtBegin(data);
			} else {
				while (current_node != null && position + 1 != index) {
					position = position + 1;
					current_node = current_node.next;
				}
				if (current_node != null) {
					new_node.next = current_node.next;
					current_node.next = new_node;
				} else {
					System.out.print("Index not present");
				}
			}
		}
	}

	public void displayLL() {

		Node current_node = head;

		while (current_node != null) {
			System.out.print(current_node.data + " ");
			current_node = current_node.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		LinkedList ll = new LinkedList();

		ll.insertAtLast(50);
		ll.insertAtLast(40);
		ll.insertAtLast(30);
		ll.insertAtBegin(20);
		ll.insertAtBegin(10);

		ll.displayLL();

	}

}
