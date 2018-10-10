package com.pm2.four;

import java.util.Arrays;

public class MainFile {

	public static void main(String[] args) {

		int arrayp[] = { 1, 0, 2, 1 };
		//int array[] = { 8,9,0,3,1 };
		//int array[] = { 13,4,45,5,6,1,3,5,7,11};
		int arraySize = arrayp.length;
		Problem4 pb4 = new Problem4();
		System.out.println(pb4.Problem4(arrayp, arraySize));
		System.out.println("Minima[] = " + Arrays.toString(pb4.getMinimaArray()));
		System.out.println("Maxima[] = " + Arrays.toString(pb4.getMaximaArray()));
	}
}
