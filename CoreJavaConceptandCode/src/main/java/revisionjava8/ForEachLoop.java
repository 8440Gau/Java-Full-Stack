package revisionjava8;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ForEachLoop {
public static void main(String[] args) {
	int[] arr = {10,20,304,43,21,43,101,0,191} ;
	
	List<Integer> list = Arrays.asList(10,20,304,43,21,43,101,0,191);
    list.forEach(a->System.out.println(a));	
  
   i1 add = (int q, int w) -> 10+20;
    	
   System.out.println("add :" + add);
   
   int max = list.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
   System.out.println("max : " + max);
   
   List<Integer> even = list.stream().filter(p -> p%2==0).limit(2) .collect(Collectors.toList());
   System.out.println("even :"+ even);
   
  
   
   
}
}

@FunctionalInterface
interface i1{
	abstract int add(int a, int b);
}