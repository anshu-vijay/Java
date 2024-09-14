package com.sample.PracticeCode;

public class LinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList.addNode(15);
		LinkedList.addNode(20);
		LinkedList.addFirst(10);
		LinkedList.addLast(30);
		LinkedList.reverselist(list);
//		LinkedList.removeFirst();
//		LinkedList.removeLast();
		printList(list);

	}

	static void printList(LinkedList list) {
		Node current = head;
		System.out.print("Printing LinkedList: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	static void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			head.next = newNode;
		}
	}

	static void removeLast() {
		Node current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;
	}

	static void removeFirst() {
		Node current = head;
		head = current.next;
		current.next = null;

	}

	static void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			Node current = temp;

			while (current.next != null) {
				current = temp;
				temp = current.next;
			}
			if (current.next == null) {
				current.next = newNode;

			}
		}

	}

	static void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

	}
	
	static void reverselist(LinkedList list) {
        Node curr = head, prev = null, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
		printList(list);
		
		
	}

}
