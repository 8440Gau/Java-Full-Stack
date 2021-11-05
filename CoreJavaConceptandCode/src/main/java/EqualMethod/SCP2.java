package EqualMethod;

public class SCP2 {
public static void main(String[] args) {
	String s1 = new String("spring");
	System.out.println("String s1 = new String(\"spring\") :result :" + s1);
	s1.concat("fall");
	System.out.println("s1.concat(\"fall\"); result:  "+ s1.concat("fall"));
	s1=s1+"winter";
	System.out.println("s1=s1+\"winter\"; result :" + s1);
	String s2 =s1.concat("summer");
	System.out.println("s1.concat(\"summer\") : "+ s2);
	
}
}
