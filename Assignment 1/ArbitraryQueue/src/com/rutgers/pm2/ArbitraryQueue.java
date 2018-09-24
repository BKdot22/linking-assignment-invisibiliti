package com.rutgers.pm2;

//import java.util.LinkedList;

public class ArbitraryQueue {
private LinkedList<Object> llqueue;

public ArbitraryQueue() {
	super();
	llqueue = new LinkedList<Object>();
}

public LinkedList<Object> getLlqueue() {
	return llqueue;
}

public void setLlqueue(LinkedList<Object> llqueue) {
	this.llqueue = llqueue;
}

public void Push(Object object) {
	try {
		llqueue.addFirst(object);
	} catch(Exception e) {
		System.out.println("Push Exception Thrown: " + e.getMessage());
	}

}

public void Enqueue(Object object) {
	try {
	llqueue.addLast(object);
	} catch(Exception e) {
		System.out.println("Enqueue Exception thrown: " + e.getMessage());
	}
}

public void Pop() {
	llqueue.removeFirst();
}

public void Dequeue() {
	llqueue.removeLast();
}

public void Traverse(int index) {
	try {
	llqueue.get(index);
	System.out.println("Index " +(index) + ": " + llqueue.get(index));
	} catch(Exception e) {
	System.out.println("Traverse Exception thrown: " + e.getMessage());
	}
}

}
