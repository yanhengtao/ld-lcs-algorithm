package com.algorithm.util;

/**
 * 
 * @author yanhengtao
 *
 */
public class ArrayUtil {
	
	/**
	 * 
	 * @param arr
	 */
	public static void printArray(int [][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
