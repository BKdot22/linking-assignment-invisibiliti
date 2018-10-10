package com.rutgers.pm2;

public class InsertionSort {
	Node head;
	Node sort;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public void push(int data) {
		Node newnode = head;
		head = new Node(data);
		head.data = data;
		head.next = newnode;
		System.out.println(head.data);
	}

	public void InsertionSort(Node headref) {
		sort = null;
		Node current = headref;
		while (current != null) {
			Node next = current.next;
			sortInsert(current);
			current = next;
		}
		head = sort;
	}

	void sortInsert(Node newnode) {
		if (sort == null || sort.data >= newnode.data) {
			newnode.next = sort;
			sort = newnode;
		} else {

			Node current = sort;
			System.out.println("");
			printlist(current);
			while (current.next != null && current.next.data < newnode.data) {
				current = current.next;
			}
			newnode.next = current.next;
			current.next = newnode;
			System.out.println("\nSwapped " + current.data + " with " + newnode.data);
		}
		printlist(sort);

	}

	void printlist(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}
