package stream;

import java.util.ArrayList;

public class WithoutStreamProcessing {
public static void main(String[] args) {
	ArrayList<Integer> I = new ArrayList<Integer>();
	for(int i=0;i<=10;i++) {
    I.add(i);
     }
   System.out.println(I);
System.out.println("********************");
ArrayList<Integer> I2 = new ArrayList<Integer>();
for(Integer i2:I) {
	if(i2%2==0) {
		I2.add(i2);
	}
}
System.out.println(I2);
}
}
