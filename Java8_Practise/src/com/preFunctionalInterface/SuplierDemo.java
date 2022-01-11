package com.preFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SuplierDemo implements Supplier<String> {

	@Override
	public String get() {
		return "Hi Sandeep";
	}

	public static void main(String[] args) {
		/*
		 * Supplier<String> supplier = new SuplierDemo();
		 * System.out.println(supplier.get());
		 */
		Supplier<String> supplier = () -> "Hi Sandeep..";

		List<String> list = Arrays.asList("a","b");
		System.out.println(list.stream().findAny().orElseGet(supplier));
	}

}
