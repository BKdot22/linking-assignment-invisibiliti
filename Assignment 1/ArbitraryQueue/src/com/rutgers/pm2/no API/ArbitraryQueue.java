package com.rutgers.pm2;
//this doesn't even work LMAO

public class ArbitraryQueue {
	static Nodes head,tails= null;
	private class Nodes  {
	
		private Object object;
		public Object getObject() {
			return object;
		}
		public void setObject(Object object) {
			this.object = object;
		}
		
		private Nodes next;

	}	
	 public static boolean isEmpty()
	 { return head == null; 
}
	public static void Push(Object object) {
		Nodes temp = head;
		if(isEmpty()) {
			head = temp;
		}
		else {
			head = (Nodes) new Object();
			head.object = object;
			head.next = temp;
		}
	}
	public static void Enqueue(Object object) {
		Nodes temp = tails;
		tails.object = object;
		tails.next = null;
		if (isEmpty()) head = tails;
		else temp.next = tails;
	}
	public static Object Pop() {
		Object object = head.object;
		head = head.next;
		return object;
	}
	public static Object Dequeue() {
		Object object = head.object;
		head = head.next;
		if(isEmpty()) tails = null;
		return object;
	}
	public static void Traverse(int index) {
		try {
			Nodes n = head;
			while (n != null) {
				System.out.println(n.object.toString());
				n=n.next;
			}
		} catch (Exception e) {
			System.out.println("Traverse Exception thrown: " + e.getMessage());
		}
		
	}
}