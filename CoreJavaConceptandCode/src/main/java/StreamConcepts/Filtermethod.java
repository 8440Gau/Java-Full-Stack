package StreamConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Filtermethod {
public static void main(String[] args) {
	List<String> memberNames = new ArrayList<>();
	memberNames.add("Amitabh");
	memberNames.add("Shekhar");
	memberNames.add("Aman");
	memberNames.add("Rahul");
	memberNames.add("Shahrukh");
	memberNames.add("Salman");
	memberNames.add("Yana");
	memberNames.add("Lokesh");
	
	memberNames.forEach(a->System.out.println(a));
	System.out.println("==================================");
	List<String> l = memberNames.stream().filter(p -> p.startsWith("A") && p.endsWith("h") ).collect(Collectors.toList());
	l.forEach(a->System.out.println(a));
}
}
