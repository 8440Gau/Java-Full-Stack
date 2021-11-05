package EqualMethod;

public class SCP {
public static void main(String[] args) {
	String sc1="Hello";
	String sc2="Hello";
	System.out.println("sc1==sc2 "+ sc1==sc2);
	System.out.println(sc1.equals(sc2));
	String s = new String("New");
	String s1 =new String("New");
	System.out.println("String new ");
	System.out.println(s==s1);
	System.out.println(s.equals(s1));
}
}
