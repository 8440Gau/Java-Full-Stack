package com.person.learning.streaminJava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenNumberwithStream {
	public static void main(String[] args) {
		
	
List<Integer> l = new ArrayList<Integer>();
l.add(10);
l.add(7);
l.add(5);
l.add(14);
l.add(3);
l.add(18);
l.add(6);

// finding all even the even numbers
List l1=l.stream().filter(a->a%2==0).collect(Collectors.toList());

System.out.println(l1.toString());
 
//finding count of odd numbers
long odd =l.stream().filter(o->o%2!=0).count();
System.out.println("odd count "+ odd);


//sorteding the element 

  List sort= l.stream().sorted().collect(Collectors.toList());
  System.out.println("sort "+ sort);

	}
	//sorting using the compartor
}