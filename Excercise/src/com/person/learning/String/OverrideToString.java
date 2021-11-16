package com.person.learning.String;



public class OverrideToString {
public static void main(String[] args) {
 	OverrideToString s=  new OverrideToString();
 	System.out.println("s :"+ s);
 	String s1 = new String("Test");
 	Integer i = new Integer(10);
 	System.out.println("i :"+i);
 	System.out.println("s1 :"+ s1);
}

/*@Override
public String toString() {
	return "OverrideToString [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}*/

}
