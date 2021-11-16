package StreamConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListStream {
public static void main(String[] args) {
	List<Integer> l = new ArrayList<Integer>();
	for(int i=0; i<10;i++) {
		l.add(i);
		System.out.println(i);
	}
	
	Stream<Integer> s = l.stream();
	s.forEach(a->System.out.println(a));
}
}
