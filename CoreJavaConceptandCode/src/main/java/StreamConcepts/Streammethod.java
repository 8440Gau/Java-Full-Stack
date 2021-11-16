package StreamConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streammethod {
public static void main(String[] args) {
	//Let’s first obtain a stream from an existing array:
	int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
	Stream.of(arr1);
	System.out.println();
	
	//change array into the list
	
	List<int[]> l = Arrays.asList(arr1);
	
	List<Integer> l1 = new ArrayList<Integer>();
	l1.add(1);
	l1.add(2);
	l1.add(3);
	 
//	Java Stream Operations
	
	
}
}
