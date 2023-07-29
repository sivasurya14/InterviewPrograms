package com.lamdaexpression;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		Interface1 ex = (a, b) -> {
			return a * b;
		};

		System.out.println(ex.display(10, 10));
		ex.show();

	}
}
