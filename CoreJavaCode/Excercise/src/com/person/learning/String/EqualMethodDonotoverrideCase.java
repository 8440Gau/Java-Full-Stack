package com.person.learning.String;

public class EqualMethodDonotoverrideCase {

	String name;
	int rollno;

	EqualMethodDonotoverrideCase(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		EqualMethodDonotoverrideCase e1= new EqualMethodDonotoverrideCase("vijayabhaskar",101);
		EqualMethodDonotoverrideCase e2= new EqualMethodDonotoverrideCase("bhaskar",102);
		EqualMethodDonotoverrideCase e3= new EqualMethodDonotoverrideCase("vijayabhaskar",101);
		EqualMethodDonotoverrideCase e4=e1;
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
	}

}
