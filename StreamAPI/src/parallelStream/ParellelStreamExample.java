package parallelStream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ParellelStreamExample {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\Files\\file.txt");

		Stream<String> txt = Files.lines(file.toPath());

		txt.parallel().forEach(System.out::println);

		txt.close();

	}

}
