package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamingFIltering {
public static void main(String[] args) {
	ArrayList<Integer> I = new ArrayList<Integer>();
	for(int i=0;i<=10;i++) {
    I.add(i);
     }
   System.out.println(I);
System.out.println("********************");
List<Integer> I2=I.stream().filter(i->i%2==0).collect(Collectors.toList());

System.out.println(I2);
}
}
