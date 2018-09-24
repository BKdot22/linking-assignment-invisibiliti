package com.rutgers.pm2;

public class LinkedList {

	private LinkedList llqueue;
	private int n = 0;

	public LinkedList getLlqueue() {
		return llqueue;
	}

	public void setLlqueue(LinkedList llqueue) {
		this.llqueue = llqueue;
	}

	public void ArbitraryQueue() {
		llqueue = new LinkedList<T>();
	}

	public void Push(T item) {
		if (null == llqueue) {
			llqueue = new LinkedList();
			llqueue = (LinkedList<T>) item;
			this.n++;
			return;
		}
	}
}