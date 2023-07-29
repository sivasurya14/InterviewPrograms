package streamAPIInteger;

import java.util.Random;

public class PrintRandomNumbers {

	public static void main(String[] args) {

		Random randomNumbers = new Random();

		randomNumbers.ints(10).forEach(System.out::println);

	}

}
