package StreamConcepts;

import java.util.Random;
import java.util.stream.Stream;

public class generate {
public static void main(String[] args) {
	//Stream.generate() or Stream.iterate() --> In the given example, we are creating a stream from generated elements. This will produce a stream of 20 random numbers. We have restricted the elements count using limit() function.

Stream<Integer> st = Stream.generate(()-> (new Random().nextInt(10))).limit(5);

st.forEach(a->System.out.println(a));

}
}
