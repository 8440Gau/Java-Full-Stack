package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
public static void main(String[] args) {
	List<Integer> l = new ArrayList<Integer>();
	l.add(10);
	l.add(20);
	 Iterator<Integer> it = l.iterator();
	 System.out.println(it.next());
	
}
}
