package com.streamDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterImplementation {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("jhon");
		list.add("sandeep");
		list.add("siba");
		list.add("pintu");

		// traditional way to filter name startswith s
		for (String s : list) {
			if (s.startsWith("s")) {
				System.out.println(s);
			}
		}

		// using lamda
		list.stream().filter(t -> t.startsWith("p")).forEach(t -> System.out.println(t));

		// for even entry set find

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");

		map.entrySet().stream().filter(k -> k.getKey() % 2 == 0).forEach(t -> System.out.println(t));
	}

}
