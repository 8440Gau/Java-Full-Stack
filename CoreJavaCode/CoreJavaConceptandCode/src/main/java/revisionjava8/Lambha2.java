package revisionjava8;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambha2 {
public static void main(String[] args) {
	ArrayList<Integer> arr= new ArrayList<Integer>();
	arr.add(1);
	arr.add(8);
	arr.add(7);
	arr.add(45);
	arr.add(32);
	arr.add(78);
	
	arr.forEach(a->System.out.println(a));
	System.out.println("-============================================");
	arr.forEach(n -> { if (n%2 == 0) System.out.println(n); });
	System.out.println("arrays");
	for(int a:arr) {
		System.out.println(a);
	}
}
}
