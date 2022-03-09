package string;

public class StringSearch {
public static void main(String[] args) {
	String s = " Let find something";
	System.out.println(s.startsWith("L"));
	int index = s.indexOf('f');
	System.out.println("index of f " + index );
	System.out.println(s.charAt(5));
}
}
