package StreamConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class matchusingStream {
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
	
  Optional<String> s=	memberNames.stream().findFirst();
	System.out.println(s);
	
  Stream s1=	 memberNames.stream().filter(p->p.startsWith("A") && p.endsWith("H".toLowerCase()));
  s1.forEach(a->System.out.println(a));
  
  long s2= memberNames.stream().filter(p->p.contains("l")).count();
  System.out.println("count "+ s2);
  
  
     
}
}
