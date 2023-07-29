package com.lamdaexpression.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {

		BiConsumer<Integer, Integer> con = (x, y) -> System.out.println("Add" + x + y);
		BiConsumer<Integer, Integer> con2 = (x, y) -> System.out.println("sub" + (x - y));

//	con.accept(2, 20);
		con.andThen(con2).accept(20, 3);

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(2, 3, 4, 4, 5);

		BiConsumer<List<Integer>, List<Integer>> con3 = (l1, l2) -> {

			if (list1.size() == list2.size())
				System.out.println("true");
			else
				System.out.println("false");

		};

		con3.accept(list1, list2);

	}
}
