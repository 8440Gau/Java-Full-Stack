package StreamConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamelementcollectedintheArray {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	
	for(int i=0;i<10;i++) {
		list.add(i);
	}
	
	Integer[] oddarr = list.stream().filter(p-> p%2!=0).toArray(Integer[]::new);
	System.out.println(oddarr);
	Stream s = Stream.of(oddarr);
	s.forEach(a->System.out.println(a));
}
}
