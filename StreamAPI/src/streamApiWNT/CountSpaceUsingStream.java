package streamApiWNT;

import java.util.Arrays;
import java.util.List;

public class CountSpaceUsingStream {

	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("sivasuriyan","dinesh", "banana", " ");

		// long count= list.forEach(x->x.equals(" ")).count();

		long spaceCount = list.stream().flatMapToInt(CharSequence::chars) // Convert each string to an IntStream of
																			// characters
				.filter(ch -> ch == ' ') // Filter out only spaces
				.count();

		System.out.println(spaceCount);
		
		
		
		
		//Remove Duplicate from String 
		
		
	//	list.stream().flatMapToInt(CharSequence::chars).

	}

}
