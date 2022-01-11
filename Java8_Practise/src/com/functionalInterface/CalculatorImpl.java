package com.functionalInterface;

//THIS IS TRADITIONAL WAY

/*
 * interface Calculator {
 * 
 * void switchOn(); }
 * 
 * public class CalculatorImpl implements Calculator {
 * 
 * public static void main(String[] args) { Calculator cal = new
 * CalculatorImpl(); cal.switchOn();
 * 
 * }
 * 
 * @Override public void switchOn() {
 * System.out.println("This is traditional way");
 * 
 * }
 * 
 * }
 */

interface Calculator {

	// void switchOn();

	// void sum(int input);

	int substract(int i1, int i2);
}

public class CalculatorImpl {

	public static void main(String[] args) {

		// no argument
		/*
		 * Calculator calculator = () -> { System.out.println("switch on !!!"); };
		 * 
		 * calculator.switchOn();
		 */

		// 1 argument
		/*
		 * Calculator calculator = (input) -> { System.out.println("inside summ method"
		 * + input); }; calculator.sum(1234);
		 */

		Calculator calculator = (i1, i2) -> {
			if (i2 < i1) {
				throw new RuntimeException("i2 should be greater");
			} else {
				return i2 - i1;
			}

		};
		System.out.println(calculator.substract(8, 20));

	}

}
