package StreamConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementinList {
public static void main(String[] args) {
	DuplicateElementinList duplicateElementinList = new DuplicateElementinList();
	duplicateElementinList.duplicateElement();
}
 public void duplicateElement() {
	 List<Integer> list = Arrays.asList(12,11,10,25,99,83,88,12,99,10);
	 Set<Integer> set = new HashSet<>();
	 List<Integer> list1 = new ArrayList<Integer>();
	 //it will return all the unique element in the list
	// list.stream().filter(p->set.add(p)).forEach(a->System.out.println(a));
	 System.out.println("==========");
	 //find the duplicate element using same concept 
	 list.stream().filter(x->!set.add(x)).forEach(x->System.out.println(x));
	 
	
 }

}

