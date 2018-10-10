package com.rutgers.pm2;

public class Nodes {

	private Object data;
	private Nodes next = null;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Nodes getNext() {
		return next;
	}

	public void setNext(Nodes next) {
		this.next = next;
	}

	public Nodes(Object data) {
		this.data = data;
	}

}
