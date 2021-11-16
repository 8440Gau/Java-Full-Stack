package revisionjava8;

import java.util.stream.Collectors;

public class WordCountinaString {
public static void main(String[] args) {
	String s="alfabetagamma";
	
	long c = s.chars().filter(p->p=='a').count();
	System.out.println(c);
	
}
}
