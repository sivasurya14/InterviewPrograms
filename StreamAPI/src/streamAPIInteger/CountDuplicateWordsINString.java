package streamAPIInteger;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountDuplicateWordsINString {

	public static void main(String[] args) {

		String value = "This is the dog and sounds threats the other dog the dog the dog dog ";
		String[] splitedValues = value.split(" ");
		List<String> listOfValues = Arrays.asList(splitedValues);

		Set<String> duplicateValues = new HashSet<>();

		System.out.println("Print the DUplicate Words in the String : ");
		Set<String> duplicateWords = listOfValues.stream().filter(valuess -> !duplicateValues.add(valuess))
				.collect(Collectors.toSet());

		duplicateWords.forEach(System.out::println);

		long countOfDuplicate = duplicateWords.stream().count();

		System.out.println("Count of the Duplicate : " + countOfDuplicate);
		System.out.println();
		Map<String, Long> DuplicateCOunt = listOfValues.stream()
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));

		DuplicateCOunt.forEach((k, v) -> {
			if (v > 1)
				System.out.println(k + " : " + v);
		});

		System.out.println();
		System.out.println("Iterating Using MAp.Entry : ");
		for (Map.Entry<String, Long> values : DuplicateCOunt.entrySet()) {

			if (values.getValue() > 1) {
				System.out.println(values.getKey() + " : " + values.getValue());
			}
		}

	}
}