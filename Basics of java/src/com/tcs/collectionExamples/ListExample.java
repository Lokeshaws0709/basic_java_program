package com.tcs.collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(1);// duplicate values are allowed

		System.out.println(l + " Insertion Order is preserved" + "Duplicate are Allowed i.e. 1");

		Iterator<Integer> itr = l.iterator();

		while (itr.hasNext()) {

			Object m = itr.next();

			System.out.println(m);
		}

	}

}
