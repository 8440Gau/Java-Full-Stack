package StreamConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class limit1 {
public static void main(String[] args) {
	List<String> ls = new ArrayList<String>();
	
	ls.add("Gaurav");
	ls.add("Saurab");
	ls.add("sab");
	ls.add("Hello");
	ls.add("Hii");
	ls.add("sab");
	ls.add("Sab");
	ls.add("sigma");
	ls.add("Alfa");
	ls.add("Beta");
	System.out.println(ls);
	System.out.println(ls.stream().sorted().limit(4).collect(Collectors.toList()));
	//System.out.println(ls.stream().collect(Collectors.toSet()));
	
     //System.out.println(ls.stream().limit(2).collect(Collectors.toList()));
	
}
}
