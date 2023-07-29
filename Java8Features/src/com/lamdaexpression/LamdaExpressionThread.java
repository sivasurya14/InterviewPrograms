package com.lamdaexpression;

public class LamdaExpressionThread {
	public static void main(String[] args) {

		Runnable t = new Runnable() {

			@Override
			public void run() {
				System.out.println("thread 1");

			}
		};
		new Thread(t).run();
// After Java 8  

		Runnable t1 = () -> System.out.println("Thread 2 is running....");

		new Thread(t1).start();
	}
}