package com.algorithm.ll;

import com.algorithm.lcs.LcsAl;
import com.algorithm.ld.LdAl;

public class SimilarityTest {

	public static void main(String[] args) {
		String str1 = "taozi";
		String str2 = "taobao";
		int lcs = LcsAl.getLCS(str1, str2).length();
		int ld = LdAl.ld(str1, str2);
		float sim = (float)(lcs) / (ld+lcs);
		System.out.println("Similarity degree:" + sim);
	}

}
