package streamAPIInteger;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {

		String name = "sivaasuriyans";

		// StringBuilder newname = new StringBuilder();

		Map<Character, Long> singleCharacter = name.chars().mapToObj(c -> (char) c).distinct()
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		singleCharacter.forEach((k, v) -> {

			System.out.print(k);

		});

		System.out.println();
		System.out.println("print without Duplicate Elements in String  : ");
		
		name.chars().mapToObj(c -> (char) c).distinct().toList().forEach(System.out::print);

		// System.out.println(newname);

		/// Another Method to pring Without Duplicate Characters

	}

}
