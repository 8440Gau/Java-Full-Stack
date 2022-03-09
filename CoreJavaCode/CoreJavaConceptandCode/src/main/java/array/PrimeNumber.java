package array;

import java.util.Scanner;

public class PrimeNumber {
	static int add=0;
public static void main(String[] args)  throws ArithmeticException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	
	 int i,m=0,flag=0;    
	
	  m=num/2;    
	  if(num==0||num==1){
	   System.out.println(num+" is not prime number");    
	  }else{
	   for(i=2;i<=m;i++){    
	    if(num%i==0){    
	     System.out.println(num+" is not prime number");    
	     flag=1;    
	     break;    
	    }    
	   }    
	   if(flag==0)  { 
		   
		   System.out.println(num+" is prime number"); 
		   int sum=0;
		   int total=0;
		   int s[]= new int[num];
		    for(int j=0;j<=num;j++) {
		    	System.out.println(j);
		           	sum = sum+j;
		           	
		        total= sum-(num+1);   	
		    }
			System.out.println("sum :" +sum);
 	        System.out.println("num  :" +num);
 	        System.out.println("total :" +total);
	   }
	  }
}
}
