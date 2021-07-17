package com.tcs.collectionExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.Spring;

public class RemoveDuplicateUsingMap {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("101", "vishnu");
		map.put("101", "Lokesh");
		map.put("103", "Suresh");

		Set<String> keys = map.keySet();

		Iterator<String> keyIter = keys.iterator();

		while (keyIter.hasNext()) {

			String key = keyIter.next();
			String value = map.get(key);

			System.out.println(key + " " + value);

			String nextValue = map.get(key);

			if (value.equals(nextValue)) {
				map.remove(key);
			}
		}

		System.out.println(map);

	}

}