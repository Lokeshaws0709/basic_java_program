package com.tcs.collectionExamples;

import java.util.ArrayList;
import java.util.Collections;

public class LinkedList {

	public static void main(String[] args) {

		ArrayList a = new ArrayList<>();
		a.add("a");
		a.add("c");
		a.add("g");
		a.add("r");
		a.add("w");
		a.add("v");

		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);

	}

}
