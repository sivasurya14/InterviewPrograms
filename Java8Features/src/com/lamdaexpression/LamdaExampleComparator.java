package com.lamdaexpression;

import java.util.Comparator;

public class LamdaExampleComparator {

	public static void main(String[] args) {
		
		Comparator<Integer> obj = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
		};
		
		System.out.println(obj.compare(10, 20));
		
		
	//After Java 8
		
		
		Comparator<Integer> obj2 =( o1, o2)->(o1.compareTo(o2));
		
		System.out.println(obj2.compare(10, 20));
		
	}
}
