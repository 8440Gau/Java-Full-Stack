package StreamConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JacksonInject.Value;


public class CreationofStream {
public static void main(String[] args) {
	List<Integer> ls = Arrays.asList(1,2,3,4,5);

   /*Consumer<Integer> c = new Consumer<Integer>() {

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);
		
	}
	   
   };
   */
	Consumer<Integer> c = i-> System.out.println(i);
	
   ls.forEach(c);
   
   ls.stream().forEach(a->System.out.println(a)); 
}
}
