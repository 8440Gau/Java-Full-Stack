package arrayList;

import java.util.ArrayList;
import java.util.List;

public class CollectionAllMethod {
public static void main(String[] args) {
	CollectionAllMethod c = new CollectionAllMethod();
	c.removeif();
	c.search();
	c.listitr();
	c.containALl();
}

public String removeif() {
List<Integer>  l1 = new ArrayList<Integer>();
	
	l1.add(1);
	l1.add(2);
	l1.add(3);
	l1.add(4);
	
	boolean b = l1.removeIf(f->f>2);
	String  b1= String.valueOf(b);
	System.out.println(b1);
	return b1;
	
}
public void search() {
List<Integer>  l1 = new ArrayList<Integer>();
	
	l1.add(1);
	l1.add(2);
	l1.add(3);
	l1.add(4);
	
	boolean t =l1.contains(1);
	System.out.println(t);
}
public void listitr() {
List<Integer>  l1 = new ArrayList<Integer>();
	
	l1.add(1);
	l1.add(2);
	l1.add(3);
	l1.add(4);
	
	l1.listIterator().forEachRemaining(a->System.out.println(a));
}
public void containALl() {
List<Integer>  l1 = new ArrayList<Integer>();
List<Integer>  l2 = new ArrayList<Integer>();
	l1.add(1);
	l1.add(2);
	l1.add(3);
	l1.add(4);
	
	l2.add(1);
	l2.add(2);
	l2.add(3);
	l2.add(4);
	
	boolean p= l1.containsAll(l2);
	System.out.println("p :" + p);
	Object o= l2.get(3);
}

}
