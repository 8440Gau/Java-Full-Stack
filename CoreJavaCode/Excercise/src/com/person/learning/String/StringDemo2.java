package com.person.learning.String;

public class StringDemo2 {
public static void main(String[] args) {
	String a = new String("A");
	String a1 = new String("A");
	System.out.println("Equal "+ a.equals(a1));
    System.out.println("eual opertor " );
    System.out.println(a==a1);
    System.out.println("new concept");
    
    String b= "Hello";
    String b1="A";
    System.out.println("new concept of b1"+  b1==a1);
    System.out.println("equal of b1 "+ b1.equals(a1) );
}
}
