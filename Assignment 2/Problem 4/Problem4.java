package com.pm2.four;

import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

public class Problem4 {

	public int[] minimaArray = null;
	public int[] maximaArray = null;

	public int[] getMinimaArray() {
		return minimaArray;
	}

	public void setMinimaArray(int[] minimaArray) {
		this.minimaArray = minimaArray;
	}

	public int[] getMaximaArray() {
		return maximaArray;
	}

	public void setMaximaArray(int[] maximaArray) {
		this.maximaArray = maximaArray;
	}

	public int Problem4(int arr[], int arraySize) {

		int count = 0;

		int[] minArr = {};
		int[] maxArr = {};
		arraySize = arr.length;

		// linear Scan Search
		for (int i = 1; i < arraySize - 1; i++) {

			// find the maxima
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				maxArr = ArrayUtils.add(maxArr, arr[i]);
				count += 1;
			}

			// find the minima
			if (arr[i] <= arr[i - 1] && arr[i] <= arr[i + 1]) {
				minArr = ArrayUtils.add(minArr, arr[i]);
				count += 1;
			}
		}

		this.setMaximaArray(maxArr);
		this.setMinimaArray(minArr);
		System.out.println("Initial array: " ");

		printArray(arr);
		System.out.println("Number of local maxima/minima: ");
		return count;
	}

	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ", ");
		}
		System.out.print("]");
	}

}
