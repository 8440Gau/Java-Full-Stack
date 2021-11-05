package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class MapFiltering {
public static void main(String[] args) {
	ArrayList<String> name = new ArrayList<String>();
	name.add("Ahbi");
	name.add("Bikky");
	name.add("Chotu");
	name.add("Vishal");
	name.add("lala");
	name.add("aaaaa");

	name.forEach(s->System.out.println(s));
	
	System.out.println("*********************");
	
	List<String> I2 = name.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	I2.forEach(a->System.out.println(a));
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
	long count = name.stream().filter(s->s.length()>5).count();
	System.out.println(count);
	
}
}
