package revisionjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Comparator {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(2,1,4,34,22,454,2);
	
	List<Integer> s=list.stream().sorted(java.util.Comparator.reverseOrder()).collect(Collectors.toList());
	s.forEach(a->System.out.println(a));
	
	
}
}
