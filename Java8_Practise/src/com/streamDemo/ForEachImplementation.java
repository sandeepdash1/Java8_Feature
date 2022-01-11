package com.streamDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachImplementation {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("jhon");
		list.add("sandeep");
		list.add("siba");
		list.add("pintu");

		// traditional approach
		for (String s : list) {
			// System.out.println(s);
		}
		//using stream api
		list.stream().forEach(t -> System.out.println(t));
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		
		map.forEach((key,value)->System.out.println(key+":"+value));
		
		map.entrySet().stream().forEach(obj -> System.out.println(obj));
	}

}
