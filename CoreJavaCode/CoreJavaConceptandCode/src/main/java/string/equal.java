package string;

public class equal {
public static void main(String[] args) {
	String a="abc";
	String b= "abc";
	
	System.out.println(a.equals(b));
	System.out.println(a==b);
	System.out.println(a.hashCode());
	System.out.print(b.hashCode());
}
}
