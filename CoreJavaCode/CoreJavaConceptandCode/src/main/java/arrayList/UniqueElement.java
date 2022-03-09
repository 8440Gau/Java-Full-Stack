package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UniqueElement {
	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(12,11,10,25,99,83,88,12,99,10);
		Collections.sort(list);
		 Set<Integer> set = new HashSet<>();
		 List<Integer> list1 = new ArrayList<Integer>();
		for(int i :list) {
			System.out.println(i);
		}
		
		System.out.println("Unique element from list");
		list.stream().distinct().forEach(a->System.out.println(a));
		
		System.out.println("Duplicate element from the list");
	List<Integer> l=	list.stream().filter(p->!set.add(p)).distinct().collect(Collectors.toList());
		//System.out.println("list :"+ l );
		List<Integer> l1=	list.stream().filter(i-> Collections.frequency(list,i)>1).collect(Collectors.toList());
		System.out.println("frequent "+ l1);
	}
}
