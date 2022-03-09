package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAllMethod {
public static void main(String[] args) {
	ArrayList<Integer> i = new ArrayList<Integer>();
	i.add(10);
	i.add(13);
	i.add(42);
	i.add(32);
	i.add(65);
	i.add(8);
	i.add(21);
	i.add(34);
	i.add(56);
	i.add(99);
i.forEach(a->System.out.println(a));
System.out.println("*****************Map******************");
ArrayList<Integer> i2= (ArrayList<Integer>) i.stream().map(j->j+10).collect(Collectors.toList());
i2.forEach(p1->System.out.println(p1));
System.out.println("*****************Count******************");

long c = i.stream().filter(l->l%2==0).count();
System.out.println(c);
System.out.println("*****************Sorted******************");
List<Integer> i3= i.stream().sorted().collect(Collectors.toList());
Comparator<Integer> comp=(a,a1)->a.compareTo(a1);
System.out.println("*****************comp******************");
System.out.println(comp.toString());
List<Integer> l4=i.stream().sorted(comp).collect(Collectors.toList());
  l4.forEach(a->System.out.println(a));
System.out.println("************Min and Max**********");
Integer min = i.stream().min(comp).get();
System.out.println("min :"+ min);
Integer max= i.stream().max(comp).get();
System.out.println("max :"+max );

}

}
