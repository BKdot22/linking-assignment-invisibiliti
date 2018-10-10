package com.rutgers.pm2;

public class MainFile {

	public static void main(String[] args) {

		Object tmpObj = null;
		
		ArbitraryQueue abq = new ArbitraryQueue();
		abq.Push(3);
		abq.Push(5);
		abq.Push(9);
		abq.Push(11);
		abq.Push(55);
		abq.PrintArbitraryQueue();
		
		abq.Push(null);
		
		abq.Pop();
		abq.PrintArbitraryQueue();
		
		try {
			tmpObj = abq.Traverse(9);
			System.out.println("index: 9: " + tmpObj);
		}
		catch(Exception e) {
			System.out.println("Traverse(9): Exception Caught: " + e.getMessage());
		}
		
		abq.Pop();
		abq.PrintArbitraryQueue();
		
		abq.Enqueue(11);
		abq.Enqueue(1);
		abq.PrintArbitraryQueue();
		
		abq.Dequeue();
		abq.PrintArbitraryQueue();
		try {
			tmpObj = abq.Traverse(2);
			System.out.println("index: 2: " + tmpObj);
		}
		catch(Exception e) {
			System.out.println("Traverse(2): Exception Caught: " + e.getMessage());
		}
	}

}
