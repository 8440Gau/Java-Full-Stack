package streaminJava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class MinandMaxusingStream {
public static void main(String[] args) {
	List<Integer> l1 = new ArrayList<Integer>();
	l1.add(10);
	l1.add(13);
	l1.add(19);
	l1.add(2);
	
	List<Integer> l2 = new ArrayList<Integer>();
	l2.add(16);
	l2.add(11);
	l2.add(7);
	l2.add(20);
	
	 OptionalInt maxNumber1 = l1.stream()
	            .mapToInt(value -> value)
	            .max();
	 System.out.println(maxNumber1);


	 int maxNumber3 = l1.stream()
	            .max(Comparator.comparing(Integer::valueOf))
	            .get();

System.out.println(maxNumber3);
}
}
