package comparaabl3evscomparator;

import java.util.Comparator;

public class ComparatorBasic implements Comparator<Emp> {
public static void main(String[] args) {
	
}

@Override
public int compare(Emp o1, Emp o2) {
	// TODO Auto-generated method stub
	return o1.name.compareTo(o2.name);
}
}
class Emp  {
	String name;
	String id;
	
}