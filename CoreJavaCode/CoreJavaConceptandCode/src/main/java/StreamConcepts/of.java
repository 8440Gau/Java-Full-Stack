package StreamConcepts;

import java.util.stream.Stream;

public class of {
public static void main(String[] args) {

// Stream.of-->	In the given example, we are creating a stream of a fixed number of integers.
	Stream<Integer> s =  Stream.of(1,2,3,4,5,6,7,8,9);
    s.forEach(a->System.out.println(a));

//Stream.of(array) --> In the given example, we are creating a stream from the array. The elements in the stream are taken from the array.
    System.out.println("Arrrays");
    Stream<Integer> s1 = Stream.of(new Integer[]{10,11,12,13,14});
    s1.forEach(a->System.out.println(a));
}
}
