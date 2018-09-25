package com.rutgers.pm2;

public class ArbitraryQueue {

	private Nodes aqNode = null;

	public Nodes getAqNode() {
		return aqNode;
	}

	public void setAqNode(Nodes aqNode) {
		this.aqNode = aqNode;
	}

	public void Push(Object data) {
		Nodes temp = new Nodes(data);
		if (aqNode == null) {
			aqNode = temp;
		} else {
			temp.setNext(aqNode);
			aqNode = temp;
		}
	}

	public void Enqueue(Object data) {
		Nodes temp = new Nodes(data);
		if (aqNode == null) {
			aqNode = temp;
		} else {
			Nodes n = aqNode;
			while (n.getNext() != null) {
				n = n.getNext();
			}
			n.setNext(temp);
		}
	}

	public void Pop() {
		if (aqNode == null) {
			System.out.println("Node is empty. Cannot delete");
		} else {
			aqNode = aqNode.getNext();
		}
	}

	public void Dequeue() {
		if (aqNode == null) {
			System.out.println("Node is empty. Cannot delete");
		} else {
			Nodes n = aqNode;
			while (n.getNext().getNext() != null) {
				n = n.getNext();
			}
			n.setNext(n.getNext().getNext());
		}
	}
	
	public Object Traverse(int index) throws Exception {
		
		Nodes n = aqNode;
		Object tmpObject = null;
		try {
			for (int i = 0; i < index; i++) {
				if (i == index-1) {
					tmpObject = n.getData();
				}
				n = n.getNext();
			}
		}
		catch(Exception e) {
			System.out.println("Traverse: Exception Caught: " + e.getMessage());
		}
		return tmpObject;
	}

	public void PrintArbitraryQueue() {

		if (null == aqNode) {
			System.out.println("Queue is Empty");
			return;
		}
		
		Nodes n = aqNode;
		System.out.print("nodes in queue: ");
		while (n != null) {
			System.out.print(n.getData() + ", ");
			n = n.getNext();
		}
		System.out.println("");
	}
}