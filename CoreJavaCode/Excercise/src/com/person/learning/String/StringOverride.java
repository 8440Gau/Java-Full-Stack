package com.person.learning.String;

public class StringOverride {
public static void main(String[] args) {
	Integer i= new Integer(10);
	String s = new String("G");
	StringOverride st= new StringOverride();
	System.out.println(i);
	System.out.println(s);
	System.out.println(st);
}

@Override
public String toString() {
	return "StringOverride []";
}

}
