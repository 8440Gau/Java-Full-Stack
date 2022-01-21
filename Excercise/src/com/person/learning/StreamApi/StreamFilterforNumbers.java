package com.person.learning.StreamApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.Collections;

public class StreamFilterforNumbers {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	List<Integer> i = Arrays.asList(1,2,3,4,5,6,7);
	
	TreeSet<Integer> s= new TreeSet<Integer>(i);
	System.out.println("TreeSet: "+s);
	
	HashSet<Integer> s1 = new HashSet<Integer>(i);

	System.out.println("HashSet: "+s);
	
	java.util.Set<Integer> s3= i.stream().filter(sort->sort%2==0).collect(Collectors.toSet());
	s3.forEach(action->System.out.println("Filter Result: " +action));
	
/*	List<List<Integer>> ints = Arrays.asList(i);
	System.out.println("Min element is " + Collections.min((Collection<? extends T>) ints));
    System.out.println("Max element is " + Collections.max((Collection<? extends T>) ints));*/
}
}