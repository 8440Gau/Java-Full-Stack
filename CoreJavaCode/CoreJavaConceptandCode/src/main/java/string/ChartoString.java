package string;

public class ChartoString {
public static void main(String[] args) {
	char a[] = {'a','b','c','d'};
	 String s = new String(a);
	 
	 System.out.println(s);

	 String s1 ="GeekforGeeks";
	char s2; 
	 s2 = s1.charAt(0);
	 
	 char[] ch1 = new char[s1.length()];
	 
	 for(int i =0;i<s1.length();i++) {
		 ch1[i]= s1.charAt(i);
	 }
	
	 for(char c1:ch1) {
		 System.out.println(c1);
	 }
	 
}
}
