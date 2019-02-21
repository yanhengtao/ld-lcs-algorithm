package com.algorithm.ld;

public class LdAlTest {
	
	public static void main(String[] args) {
		String str1 = "taoziloveruning";
		String str2 = "taoziloveplay";
		System.out.println("ld = " + LdAl.ld(str1, str2));
		System.out.println("sim = " + LdAl.sim(str1, str2));
	}
}
