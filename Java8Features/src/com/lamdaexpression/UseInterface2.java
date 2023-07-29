package com.lamdaexpression;

public class UseInterface2 {

	public static void main(String[] args) {
		
	

		Interface2 sd = () -> System.out.println("printingg.....");

		sd.display();

		Interface1 add = (a, b) -> (a + b);

		Interface1 multiply = (a, b) -> a * b;

		System.out.println("the addition of two two values is : " + add.display(10, 10));
		System.out.println("the multiply of two number is : " +multiply.display(10, 10));
		
		

	}
}
