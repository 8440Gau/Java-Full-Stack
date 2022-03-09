package set;

import java.util.HashSet;
import java.util.Set;

public class HashsetDulipcation {
public static void main(String[] args) {
	Set<String> set = new HashSet<String>();
	set.add("hi");
	set.add(null);
	set.add("hi");
	
	set.forEach(a->System.out.println(a));
}
}
