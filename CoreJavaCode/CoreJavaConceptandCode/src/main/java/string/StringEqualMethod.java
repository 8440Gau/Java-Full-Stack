package string;

public class StringEqualMethod {
public static void main(String[] args) {
	String a = new String("Singh");
	String b ="Singh";
	String c= "Singh";
	String d="singh";
	char[] c1= {'s','i','n','g','h'};
	System.out.println(a.equals(b));//true
	System.out.println(b.equals(c));//true
	System.out.println(c.equals(d));//false
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	System.out.println(c.hashCode());
	System.out.println(d.hashCode());
	
	System.out.println("EqualIngoreCase");
	System.out.println(a.equalsIgnoreCase(d));
	
	System.out.println("ContentEqual");
	System.out.println(c1.toString().contentEquals(a));
	
}
}
