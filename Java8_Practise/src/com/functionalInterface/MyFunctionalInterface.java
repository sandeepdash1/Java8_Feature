package com.functionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	void m1();
	
	default void m2() {
		System.out.println("Inside FunctionalInterface default method m2()...");
	}
	
	default void m3() {
		System.out.println("Inside FunctionalInterface default method m3()...");
	}
	
	static void m4() {
		System.out.println("Inside FunctionalInterface static method m4()...");
	}

}
