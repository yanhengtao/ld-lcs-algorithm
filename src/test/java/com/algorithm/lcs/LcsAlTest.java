package com.algorithm.lcs;

import java.util.Scanner;

/**
 * 
 * @author yanhengtao
 *
 */
public class LcsAlTest {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please input two string:");
		System.out.print("First string: ");
		String str1 = scanner.next();
		System.out.print("Second string: ");
		String str2 = scanner.next();
		System.out.print("Longest common subsequence: ");
		String lcs = LcsAl.getLCS(str1, str2);
		// String lcs = getLCS("BDCABA", "ABCBDAB");
		// String lcs = getLCS("tao", "tsy");
		System.out.println("LCS: " + lcs);
	}

}
