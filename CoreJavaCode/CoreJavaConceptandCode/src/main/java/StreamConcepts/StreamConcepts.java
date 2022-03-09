package StreamConcepts;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

public class StreamConcepts {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("A","A","A","C","B","B");
	      List<String> list2 = Arrays.asList("A","A","B","B");
	      
	      System.out.println("Commons Objects of List 1 and List 2: " + CollectionUtils.intersection(list1, list2));

	}

}
