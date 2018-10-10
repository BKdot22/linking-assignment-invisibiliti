package com.rutgers.pm2;

public class MainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Problem 2: ");
		ArbitraryQueueArray test = new ArbitraryQueueArray();
		test.Push(1);
		test.Push(2);
		test.Push(3);
		//test.Pop();
		test.Enqueue(4);
		test.Enqueue(5);
		test.Dequeue();
		
		int length = test.getArrq().length;
		System.out.println("Length: " + length);
		System.out.println("Arbitrary Queue Array: ");
		Object[] temp = test.getArrq();
		for (int i = 0; i < length; i++) {
			System.out.println(temp[i]);
		}
		System.out.println("Element 3: " + 	test.Traverse(3));
	}
} 
