package com.lamdaexpression.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		
		Consumer<String> con = (s)->System.out.println(s.toUpperCase()); 		
	     con.accept("java");
	    Consumer<String> con1=(s)->System.out.println(s.toLowerCase());
	    con1.accept("JAVA");
	    
	    con.andThen(con1).accept("Java 8 Features");
	    
	    Consumer<String>  con2 =(s)-> s.toLowerCase();
	     
		
		
	}

}
