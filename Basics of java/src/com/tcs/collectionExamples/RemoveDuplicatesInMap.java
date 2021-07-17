package com.tcs.collectionExamples;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicatesInMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Anil");
		hm.put(2, "Deven");
		hm.put(3, "Sanjay");
		hm.put(4, "Sanjay");
		hm.put(5, "RAj");
		hm.put(6, "Sanjay");

		HashSet<String> hm2 = new HashSet<String>();
		hm2.addAll(hm.values());
		for (String str : hm2) {

			System.out.println(str);
		}

	}
}
