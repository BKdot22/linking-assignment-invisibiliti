package com.pm2.three;

public class MainFile {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		/*
		 * Nodes node1 = new Nodes(45); Nodes node2 = new Nodes(37); Nodes node3 = new
		 * Nodes(25); Nodes node4 = new Nodes(19); Nodes node5 = new Nodes(7);
		 * 
		 * node1.setNext(node2); node2.setNext(node3); node3.setNext(node4);
		 * node4.setNext(node5);
		 * 
		 * //set node1 the start of the linked list ll.setStart(node1); ll.printList();
		 */

		ll.add(45);
		ll.add(37);
		ll.add(25);
		ll.add(19);
		ll.add(7);
		int Size = ll.size();
		System.out.print("Before: ");
		ll.printList();
		
		ll.setHead(ll.shuffleNode(ll.getHead(), Size));
		System.out.print("Shuffled: ");
		ll.printList();
		
		// Nodes resultLinkedList = ll.quickSort(node1, node5);
		Nodes tempNode = ll.quickSort(ll.getHead(), ll.getLastNode());
		ll.setStart(tempNode);
		System.out.print("After: ");
		ll.printList();

	}

}
