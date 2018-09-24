package com.rutgers.pm2;

public class ArbitraryQueueArray {
	private Object[] arrq;
	private int n = 0;

	public ArbitraryQueueArray() {
		super();
		// arrq = new Object[1];
	}

	public Object[] getArrq() {
		return arrq;
	}

	public void setArrq(Object[] arrq) {
		this.arrq = arrq;
	}

	private void Resize(int size) {
		{
			Object[] copy = new Object[size];
			for (int i = 0; i < n; i++)
				copy[i] = arrq[i];
			arrq = copy;
		}
	}

	public void Push(Object item) {
		try {
			if (null == arrq) {
				arrq = new Object[1];
				arrq[0] = item;
				this.n++;
				return;
			}
			if (n == arrq.length)
				Resize(arrq.length + 1);
			arrq[n++] = item;
		} catch (Exception e) {
			System.out.println("Push Exception Thrown: " + e.getMessage());
		}
	}

	public void Pop() {
		Object item = arrq[--n];
		arrq[n] = null;
		if (n > 0 && n == arrq.length - 1)
			Resize(arrq.length - 1);
	}

	public void Enqueue(Object obj) {
		Object[] temp = null;

		if (null == arrq) {
			temp = new Object[1];
			temp[0] = obj;
		} else {
			temp = new Object[arrq.length + 1];
			// temp[0] = obj;
			for (int i = 0; i < arrq.length; i++) {
				temp[i] = arrq[i];
			}
			temp[arrq.length] = obj;
		}
		arrq = temp;
		n = arrq.length;
	}

	public void Dequeue() {
		/*
		 * Object item = arrq[--n]; arrq[n] = null; if (n > 0 && n == arrq.length -1)
		 * Resize(arrq.length - 1 );
		 */
		if (null == arrq) {
			return;
		}
		Object[] temp = new Object[arrq.length - 1];
		for (int i = 0; i < arrq.length - 1; i++) {
			temp[i] = arrq[i];
		}
		arrq = temp;
	}
	public Object Traverse(int index) {
		return arrq[index-1];
	}
}
