package com.person.learning.streaminJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class CountingBySteam {
public static void main(String[] args) {
	List<String> len = new ArrayList<String>();
	len.add("check1");
	len.add("Hell...no");
	len.add("Sab changa si");
	len.add("Crack the code");
	len.add("Sab khatam...");
	
	len.forEach(a->System.out.println(a));
	
	System.out.println("Counting by lenght");
	
	long a= len.stream().filter(lenghtofString->lenghtofString.length()<7 ).count();
	System.out.println(a);
}
}
