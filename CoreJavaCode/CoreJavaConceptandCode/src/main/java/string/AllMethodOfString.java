package string;

public class AllMethodOfString {
public static void main(String[] args) {
	String s ="Welcome";
	System.out.println("charat " +s.charAt(2));
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.format(" %b", s));
	//System.out.println(s.format(" %f ",s.length()));
	System.out.println(s.length());
	System.out.println("substring :" +s.substring(5));
	System.out.println(s.contains("w"));
	System.out.println(!s.isEmpty());
}
}
