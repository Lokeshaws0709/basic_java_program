package com.tcs.collectionExamples;

import java.util.TreeMap;

public class TreeMapExamples {

	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		
		t.put(101, "abc");
		t.put(102, "bcd");
		t.put(103, "cde");
		t.put(104, "def");
		t.put(104, "efg");
		
		System.out.println(t);
	}

}
