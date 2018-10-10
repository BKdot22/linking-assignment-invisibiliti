package com.pm2.three;

public class Nodes {

	private int data;
	private Nodes next = null;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Nodes getNext() {
		return next;
	}

	public void setNext(Nodes next) {
		this.next = next;
	}

	public Nodes(int data) {
		this.data = data;
	}

}
