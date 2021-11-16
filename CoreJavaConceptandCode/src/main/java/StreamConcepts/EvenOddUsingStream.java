package StreamConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenOddUsingStream {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	for(int i =0; i<10;i++) {
		list.add(i);
	}
	
	Stream<Integer> s = list.stream();
	
	List<Integer> even =list.stream().filter(p->p%2==0).collect(Collectors.toList());
	even.forEach(a->System.out.println(a));
}
}
