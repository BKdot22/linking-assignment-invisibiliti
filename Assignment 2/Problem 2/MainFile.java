package com.pm2.two;

import java.util.Arrays;

public class MainFile {

	public static void main(String[] args) {

		//int[] array = { 99 };
		//int[] array = { 99, 3};
		int[] arr = { 4, 11, 34, 6, 9, 0, -1, -55, 25 };
		int arraySize = arr.length;
		Problem2 pb2 = new Problem2();

		System.out.println("Before Sort:  " + Arrays.toString(arr));
		pb2.mergeSort(arr, arraySize);
		System.out.println("After Sorted: " + Arrays.toString(arr));
	}
}
