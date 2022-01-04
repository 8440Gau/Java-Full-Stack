package MapandStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodofStream {
	public static void main(String[] args) {
		MethodofStream m = new MethodofStream();
		m.allMatch();
		m.anymatch();
		m.Builder();
		m.count();
		m.distinct();
		m.filter();
		m.findAny();
		m.findfirst();
	}

	public void allMatch() {
		// It returns all elements of this stream which match the provided predicate.
		// If the stream is empty then true is returned and the predicate is not
		// evaluated.
		List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
		boolean allMatch = list.stream().allMatch(p -> p % 3 == 0);
		System.out.println("allmatch :" + allMatch);

	}

	public void anymatch() {
		// It returns any element of this stream that matches the provided predicate. If
		// the stream is empty then false is returned and the predicate is not
		// evaluated.
		List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
		boolean anymatch = list.stream().anyMatch(p -> p % 2 == 0);
		System.out.println("anymatch :" + anymatch);
	}

	public void Builder() {
		// It returns a builder for a Stream.
		Stream.Builder<String> builder = Stream.builder();
		// Adding elements in the stream of Strings
		Stream<String> stream = builder.add("Geeks").add("for").add("Geeks").add("GeeksQuiz").build();
		stream.forEach(a -> System.out.println("Builder :" + a));

	}

	public void count() {
		List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
		long a = list.stream().count();
		System.out.println("Count Method :" + a);
	}

	public void distinct() {
		List<String> list = Arrays.asList("Geeks", "for", "Geeks", "GeeksQuiz", "GeeksQuiz");
		Stream<String> s = list.stream().distinct();
		s.forEach(a -> System.out.println("distinct :" + a));
	}

	public void filter() {
		List<String> list = Arrays.asList("Geeks", "for", "Geeks", "GeeksQuiz", "GeeksQuiz");
		List<String> l = list.stream().filter(p -> p.startsWith("f")).collect(Collectors.toList());
		l.forEach(a -> System.out.println("filter :" + a));
	}

	public void findAny() {
		List<String> list = Arrays.asList("Geeks", "for", "Geeks", "GeeksQuiz", "GeeksQuiz");
		Optional<String> s = list.stream().findAny();
		System.out.println("findAny :" + s);

	}

	public void findfirst() {
		List<String> list = Arrays.asList("Geeks", "for", "Geeks", "GeeksQuiz", "GeeksQuiz");
		Optional<String> o = list.stream().findFirst();
		System.out.println("findfirst :" + o);
	}

	public void sorted() {

	}

	public void max() {

	}

	public void min() {

	}

	public void reduce() {

	}

	public void skip() {

	}

}
