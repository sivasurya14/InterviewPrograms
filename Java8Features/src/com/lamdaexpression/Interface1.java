package com.lamdaexpression;


@FunctionalInterface
interface Interface1 {

	int display(int a, int b);

	default void show() {

		System.out.println("printing from default method...");
	}

	static void display2() {

		System.out.println("message from static method is printing...");
	}

}
