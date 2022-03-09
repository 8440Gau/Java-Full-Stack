package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SettoListandListtoSet {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("saurabh");
	list.add("gaurav");
	list.add("bicky");
	list.add("anand");
    list.add("gaurav");
    list.add(null);
    
    
	Iterator<String> itr = list.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	System.out.println("convert list into set");
	
	Set<String> str = new HashSet<String>(list);
	
	str.forEach(a->System.out.println(a));
	
	System.out.println("Convert set into the list");
	
	Set<Integer> i = new HashSet<Integer>();
	
	i.add(1);
	i.add(2);
	i.add(null);
	i.add(null);
	
	for(Object i1:i){
		System.out.println(i1);
	}
	System.out.println("============================");
	List<Integer> l = new LinkedList<Integer>(i);
	l.forEach(a->System.out.println(a));
	
}
}
