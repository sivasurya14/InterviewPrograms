package streamAPIInteger;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ConcatInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> firstlist = Arrays.asList(2, 4, 5, 6, 7);
		List<Integer> secondList = Arrays.asList(3, 4, 2, 4, 2);
		List<Integer> thridList = Arrays.asList(10, 20, 30, 40);

		Stream<Integer> concatStream = Stream.concat(firstlist.stream(), secondList.stream());

		System.out.println(concatStream.sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

		
	long maxvalue=concatStream.max(Comparator.comparing(Integer::valueOf)).get();
	
	System.out.println(maxvalue);
	
	
	
	
	
	
	
	
	
	}

}
