package string;

public class Reverse_String {
public static void main(String[] args) {
	Reverse_String r = new Reverse_String();
	r.reverseStringwithoutfunction();
}
public void reverseStringwithoutfunction() {
	String originalword="HelloConvertintoReverse",reverseString ="";
	char ch ;
	for(int i=0; i<originalword.length();i++) {
		ch = originalword.charAt(i);
		reverseString = ch+reverseString;
	}
	System.out.println("reverseString :" +reverseString);
	StringBuffer st= new StringBuffer(originalword).reverse();
	System.out.println(st.toString());
}
}
