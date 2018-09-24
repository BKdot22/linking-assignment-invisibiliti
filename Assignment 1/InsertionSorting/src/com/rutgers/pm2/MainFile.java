package com.rutgers.pm2;

public class MainFile {

	public static void main(String[] args) 
	{ 
		InsertionSort test = new InsertionSort(); 
		test.push(10); 
		test.push(4); 
		test.push(14); 
		test.push(9); 
		test.push(3); 
		System.out.println("Linked test start"); 
		test.printlist(test.head); 
		test.InsertionSort(test.head); 
		System.out.println("\nLinked test After Sorting"); 
		test.printlist(test.head); 
	} 
}
