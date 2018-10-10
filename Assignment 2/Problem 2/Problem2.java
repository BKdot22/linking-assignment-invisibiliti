package com.pm2.two;

import java.util.Arrays;

public class Problem2 {
	
	public static void swap(int[] arr, int index1, int index2) {

		// swap 2 number with XOR bit Operator
		arr[index1] = arr[index1] ^ arr[index2];
		arr[index2] = arr[index1] ^ arr[index2];
		arr[index1] = arr[index1] ^ arr[index2];
	}
	
	static void mergeRight(int[] arr, int first, int last) {
		
		for (int idx = first; idx < last; idx++) {
			if (arr[idx] > arr[idx+1])
				swap(arr, idx, idx+1);
		}
	}
	
	public static void merge(int[] arr, int first, int last, int mid) {
		
		for (int idx = first; idx <= mid; idx++) {
			if (arr[idx] > arr[mid+1]) {
				swap(arr, idx, mid+1);
				mergeRight(arr, mid+1, last);
			}
		}
	}
	
	public static void mergeSort(int[] arr, int first, int last) {
		
		//System.out.println("first: " + first + ", last: " + last);
		if (0 == last - first) {
			// one element in an array - do nothing
			return;
		}
		else if (1 == last - first) {
			// two elements in an array - swap if needed
			if (arr[first] > arr[last])
				swap(arr, first, last);
		}
		else {
			// Array size >= 3
			int mid = (first + last) / 2;

			mergeSort(arr, first, mid);
			mergeSort(arr, mid+1, last);
			merge(arr, first, last, mid);
		}
	}
	
	public static void mergeSort(int[] arr, int arraySize) {
		arraySize = arr.length;
		mergeSort(arr, 0, arraySize-1);
	}
	
}
