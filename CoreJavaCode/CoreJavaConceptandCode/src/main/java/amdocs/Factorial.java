package amdocs;

public class Factorial {
public static void main(String[] args) {
	System.out.println(factorial(5));
}
public static long factorial(int i) {
	if(i==1) {
		return 1;
	}
	return i*factorial(i-1);
}
}
