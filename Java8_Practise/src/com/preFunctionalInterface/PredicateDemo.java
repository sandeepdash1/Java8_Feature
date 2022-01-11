package com.preFunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {

	/*
	 * @Override public boolean test(Integer t) { if (t % 2 == 0) { return true; }
	 * else { return false; } }
	 */

	public static void main(String[] args) {
		/*
		 * Predicate<Integer> predicate = (t) -> { if (t % 2 == 0) { return true; } else
		 * { return false; } }; System.out.println(predicate.test(4));
		 */
		/*
		 * new PredicateDemo(); System.out.println(predicate.test(4));
		 */

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("printing " + t));
	}

}
