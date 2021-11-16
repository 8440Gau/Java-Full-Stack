package StreamConcepts;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringCharacterandToken {
public static void main(String[] args) {
	//In the given example, first, we are creating a stream from the characters of a given string. In the second part, we are creating the stream of tokens received from splitting from a string.

	IntStream stream ="12345_abcde".chars();
	stream.forEach(a->System.out.println(a));

	//OR
	System.out.println("=================================");
	Stream<String> stream1 = Stream.of("A$B$C".split("\\$"));
    stream1.forEach(p -> System.out.println(p));
}
}
