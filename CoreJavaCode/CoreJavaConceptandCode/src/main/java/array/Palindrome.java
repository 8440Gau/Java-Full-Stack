package array;

public class Palindrome {
public static void main(String[] args) {
	int number =454;
	int rem,temp,sum=0;
	
	temp= number;
	
	while(number>0) {
		rem=number%10;
		System.out.println(rem);
		System.out.println("rem : " + rem);
		sum=(sum*10)+rem;
		System.out.println(sum);
		number= number/10;
		
	}
	if(temp==sum) {
		System.out.println("its palindrome :" + sum);
	}else {
		System.out.println(" not palinfrome : " + sum);
	}
	
}
}
