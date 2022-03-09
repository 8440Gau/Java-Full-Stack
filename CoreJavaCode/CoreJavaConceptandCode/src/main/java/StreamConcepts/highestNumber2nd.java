package StreamConcepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class highestNumber2nd {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(12,31,98,21,323,8);
	
	System.out.println(list.stream().sorted(Comparator.reverseOrder()).distinct().limit(2).skip(1).findFirst().get());
}
}
