package StreamConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Linkedlistreverse {
public static void main(String[] args) {
	 List<Integer> list = Arrays.asList(12,11,10,25,99,83,88,12,99,10);
	 Linkedlistreverse l = new Linkedlistreverse();
	 l.reverse(list);
	 System.out.println(l.reverse(list));
}

public static Integer reverse(List<Integer> list){
	Integer temp=null;
	for(int i=0;i<list.size()/2;i++) {
		temp = list.get(i);
		list.set(i, list.get(list.size()-i-1));
		//list.set(list.size()-i-1, (String) temp);
		list.set(list.size()-i-1, temp);
		
	}
	return temp;
}
}
