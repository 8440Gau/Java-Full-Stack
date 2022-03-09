package revisionjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ConversionofListtoSetandArraytoListandviceVersa {
public static void main(String[] args) {
	
	System.out.println(" List to Arrays");
	List<Integer> source = Arrays.asList(1,2,3);
	
	source.add(1);
	source.add(2);
	source.add(3);
System.out.println("for Each");
	source.forEach(a->System.out.println(a));
	Integer[] t = source.toArray(new Integer[0]);
	System.out.println(t.toString());
	
	System.out.println("Arrays to List");
	Integer[] sourceArrays = {1,2,3,4};
   List<Integer> l = Arrays.asList(sourceArrays);
   System.out.println("for loop");
   for(int i =0 ;i<l.size();i++) {
	   System.out.println(l);
   }
}
}
