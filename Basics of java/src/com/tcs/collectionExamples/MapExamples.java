package com.tcs.collectionExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExamples {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();

		m.put(10, "Vishnu");
		m.put(2, "Lokesh");
		m.put(30, "Naveen");
		m.put(4, "Porna");
		m.put(5, "Suresh");
		m.put(68, "Vinod");
		m.put(7, "Sukku");
		System.out.println(m);

		/*
		 * Map is not child interface of the Collection Frame work. In Map there is no
		 * Iterator.In Map we want to Iterate the values. For this we take the Set there
		 * a iterator.Set is the Interface of the Collection FrameWork so the Map data
		 * Convert into Set after we converted u will iterated
		 */

		Set s = m.keySet();
		Set s1 = m.entrySet();

		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + " " + m1.getValue());

		}
	}
}
