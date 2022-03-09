package arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Generic {
public static void main(String[] args) {
	List<String> ls = new ArrayList<String>();
	ls.add("Hello");
	ls.add("Bye");
	ls.add("Hii");
	ls.add("Hello");
	
	ls.forEach(a->System.out.println(a));
	
	System.out.println("Set");
	
	Set<String> s1 = new HashSet<String>(ls);
	
	s1.forEach(a->System.out.println(a));
	
	List<Object> ls1 = new ArrayList<Object>();
	ls1.add("Hello");
	ls1.add(2);
	//ls1.forEach(a->System.out.println(a));
	
 }
}
