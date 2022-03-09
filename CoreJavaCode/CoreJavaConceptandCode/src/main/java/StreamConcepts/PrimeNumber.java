package StreamConcepts;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
public static void main(String[] args) {
	 int num= 20;
	 boolean flag= false;
	 for(int i=2;i<=num/2;++i) {
		 if(num%i==0) {
			 flag=true;
			 break;
		 }
		 System.out.println("outside");
	 }
	 
	 
}
}
