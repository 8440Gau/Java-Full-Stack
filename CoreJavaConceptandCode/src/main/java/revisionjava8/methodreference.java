package revisionjava8;

public class methodreference {
	
public static void main(String[] args) {
A a1 = System.out::println;
}
}

interface A{
	abstract void m1();
}