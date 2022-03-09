package StreamConcepts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FruitSorting {
public static void main(String[] args) {
	List<String> l = new ArrayList<String>();
	l.add("banana");
	l.add("apple");
	l.add("cocunut");
	l.add("jackfruit");
	l.add("mango");
	
   Stream s =	l.stream().sorted();
   s.forEach(a->System.out.println(a));
   
   //another method
   List<String> l2=l.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
   System.out.println("l2");
   System.out.println(l2);
   
   // descending order
   List<String> reverseorder = l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
   System.out.println("reverseorder : "+ reverseorder);
   
   List<String> reverseorder2 = l.stream().sorted((o1,o2)-> o2.compareTo(o1)).collect(Collectors.toList());
   System.out.println("reverseorder2 : "+ reverseorder2);
   
}
}
