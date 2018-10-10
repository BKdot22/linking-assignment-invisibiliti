package com.pm2.one;

public class Problem1 {

	public static void Problem1Sort(int[] a, int arraySize) {

		// find the largest value in the array
		int[] temp = a;
		int max = temp[0];
		for (int k = 0; k < arraySize; k++) {
			if (temp[k] > max) {
				max = temp[k];
			}
		}

		// find the length of largest value
		String maxString = String.valueOf(max);
		int digits = maxString.length();
				
		int[] tempDigit = new int[arraySize];
		int[] scratchArr = copyArray(a);
		printArray(scratchArr);
		System.out.println(" --> Initial Input");
		for (int j = digits - 1; j >= 0; j--) {
			
			for (int i = 0, k = 0; i < arraySize; i++, k++) {
				
				String[] tmpString = convert2String(scratchArr, digits);
				String s = tmpString[i];
				tempDigit[k] = (int) Character.getNumericValue(s.charAt(j));
			}
			
			int[] tempSorted = copyArray(tempDigit);
			tempSorted = sortArray(tempSorted, scratchArr);
			printArray(scratchArr);
			System.out.print(" --> Sorted by ");
			printArray(tempSorted);
			System.out.println("");
		}
	}
	
	public static int[] copyArray(int[] arrIn) {
		
		int[] copy = new int[arrIn.length];
		for (int i = 0; i < arrIn.length; i++) {
			copy[i] = arrIn[i];
		}
		return copy;
	}
	
	public static int[] sortArray(int[] arrIn, int[] arrOrig) {
		
		int[] intArr = new int[arrIn.length];
		intArr = arrIn;

		for (int j = 0; j < intArr.length - 1; j++) {
			for (int i = 0; i < intArr.length - 1; i++) {
				if (intArr[i] > intArr[i + 1]) {
					/*
					int temp = intArr[i + 1];
					int temp2 = arrOrig[i+1];
					intArr[i + 1] = intArr[i];
					arrOrig[i+1] = arrOrig[i];
					intArr[i] = temp;
					arrOrig[i] = temp2;
					*/
					swap(intArr, i, i+1);
					swap(arrOrig, i, i+1);
				}
			}
		}

		return intArr;
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp2 = arr[a];
		arr[a] = arr[b];
		arr[b] = temp2;
	}
	
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ", ");
		}
		System.out.print("]");
	}

	public static String[] convert2String(int[] a, int maxSize) {
		
		String[] tmpStr = new String[a.length];

		String strFormat = "%0" + maxSize + "d";
		for (int idx = 0; idx < a.length; idx++) {
			tmpStr[idx] = String.format(strFormat, a[idx]);
		}
		return tmpStr;
	}
}
